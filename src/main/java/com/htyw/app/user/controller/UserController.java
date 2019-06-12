package com.htyw.app.user.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.support.json.JSONParser;
import com.alibaba.fastjson.JSON;
import com.htyw.app.token.pojo.TokenEntity;
import com.htyw.app.token.service.TokenService;
import com.htyw.app.user.pojo.User;
import com.htyw.app.user.service.UserService;
import com.htyw.app.utils.MD5Util;
import com.htyw.app.utils.MsgSend1;
import com.htyw.app.utils.RedisUtil;

@RestController
@RequestMapping("MyInfo")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private RedisUtil redisUtil;
	@Autowired
	private TokenService tokenService;

	/**
	 * 修改用户信息
	 * 
	 * @param user：用户信息
	 * @return int：影响行数
	 */
	/*
	 * @RequestMapping(value = "myInfoSave", method = RequestMethod.POST) public
	 * Map<String, Object> updateUserInfo(HttpServletRequest request,
	 * HttpServletResponse response){ Map<String, Object> result = new
	 * HashMap<String, Object>(); String phone = request.getParameter("phone");
	 * String password = request.getParameter("password"); User user = new
	 * User(); int i = userService.updateUser(user); if(i == 1){
	 * result.put("code", "200"); result.put("message", "success"); }else{
	 * result.put("code", "201"); result.put("message", "failed"); } return
	 * result; }
	 */
	@RequestMapping(value = "check", method = RequestMethod.POST)
	public Map<String, Object> getToken(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String token = request.getParameter("token");
		System.out.println("获取到的token===" + token);
		String json = (String) redisUtil.get(token);
		JSONObject jsonObject = new JSONObject(json);
		Long timeStamp = (Long) jsonObject.get("tokenExpiryTime");
		Long now = System.currentTimeMillis();
		if (now > timeStamp) {
			result.put("code", "201");
			result.put("message", "failed");
		} else {
			result.put("code", "200");
			result.put("message", "success");
		}
		return result;
	}

	/**
	 * 根据手机号、密码登录
	 * 
	 * @param phone:用户手机号
	 *            password:用户输入的密码
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public Map<String, Object> getPassById(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		// 加密密码
		String passwords = UserController.md5(password, phone);
		System.out.println("加密后=" + passwords);
		try {
			User user = userService.selectByPassword(phone, passwords);
			if (null != user) {
				String userName = user.getCustomerName();
				String token = tokenService.generateToken(phone, userName);
				tokenService.saveToken(token, user);
				TokenEntity entity = new TokenEntity();
				entity.setIsLogin("true");
				entity.setToken(token);
				entity.setUSER(user);
				entity.setTokenCreatedTime(System.currentTimeMillis());
				entity.setTokenExpiryTime(System.currentTimeMillis() + 48 * 60 * 60 * 1000);
				result.put("tokenEntity", entity);
				result.put("user", user);
				result.put("code", "200");
				result.put("message", "success");
			} else {
				result.put("code", "201");
				result.put("message", "failed");
			}
		} catch (Exception e) {
			result.put("code", "202");
			result.put("message", "failed");
		}
		return result;
	}

	/**
	 * 根据用户手机号修改密码
	 * 
	 * @param phone：用户手机号
	 * @param oldPassword：旧密码
	 * @param newPassword：新密码
	 * @return
	 */
	@RequestMapping(value = "updatePass", method = RequestMethod.POST)
	public Map<String, Object> updatePassById(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String phone = request.getParameter("phone");
		String oldPassword = request.getParameter("oldPassword");
		String newPassword = request.getParameter("newPassword");
		// 加密密码
		String passwords = UserController.md5(oldPassword, phone);
		try {
			User user = userService.selectByPassword(phone, passwords);
			if (null != user) {
				// String endPassword = MD5Util.getStringMD5(newPassword);
				// 加密新密码
				String endPassword = UserController.md5(newPassword, phone);
				int i = userService.updatePass(phone, endPassword);
				if (i == 1) {
					user = userService.selectByPassword(phone, endPassword);
					String userName = user.getCustomerName();
					String token = tokenService.generateToken(phone, userName);
					tokenService.saveToken(token, user);
					TokenEntity entity = new TokenEntity();
					entity.setIsLogin("true");
					entity.setToken(token);
					entity.setTokenCreatedTime(System.currentTimeMillis());
					entity.setTokenExpiryTime(System.currentTimeMillis() + 48 * 60 * 60 * 1000);
					result.put("tokenEntity", entity);
					result.put("user", user);
					result.put("code", "200");
					result.put("message", "success");
				} else {
					result.put("code", "201");
					result.put("message", "failed");
				}
			} else {
				result.put("code", "202");
				result.put("message", "密码错误");
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "202");
			result.put("message", "密码错误");
		}
		return result;
	}

	public static String md5(String value, String seed) {
		if (value == null || seed == null) {
			return value;
		}
		String valueSeed = value + seed;
		System.out.println(valueSeed);
		return MD5Util.getStringMD5(valueSeed);
		// return
		// Md5Token.getInstance().getLongToken(Md5Token.getInstance().getLongToken(value)
		// + seed);
	}

	@RequestMapping(value = "selectByPhone", method = RequestMethod.POST)
	public Map<String, Object> selectByPhone(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String phone = request.getParameter("phone");
		try {
			User user = userService.selectByPhone(phone);
			result.put("user", user);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			result.put("code", "202");
			result.put("message", "failed");
		}
		return result;
	}

	/**
	 * 修改个人信息
	 * 
	 */
	@RequestMapping(value = "changeUserInfo")
	public Map<String, Object> changeUserInfo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String email = request.getParameter("email");
		String contactAddress = request.getParameter("contactAddress");
		Long postalCode = Long.valueOf(request.getParameter("postalCode")).longValue();
		String contactNumber = request.getParameter("contactNumber");

		try {
			userService.changeUserInfo(email, contactAddress, postalCode, contactNumber);
			result.put("code", 200);
			result.put("message", "success!");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;
	}

	/**
	 * 更新头像
	 */
	@RequestMapping(value = "changeHeadImage")
	public Map<String, Object> changeHeadImage(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String headImageUrl = request.getParameter("headImageUrl");
		Long id = Long.valueOf(request.getParameter("id"));

		try {
			userService.changeHeadImage(headImageUrl, id);
			result.put("code", 200);
			result.put("message", "success!");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;

	}

	// 找回密码发送验证码
	@RequestMapping("sendCheck")
	public Map<String, String> sendCheck(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> result = new HashMap<String, String>();
		String phone = request.getParameter("contactNumber");
		int checkNum = (int) ((Math.random() * 9 + 1) * 1000);
		// 获取当前时间
		// 获取当前时间+2分钟
		long etime1 = System.currentTimeMillis() + 2 * 60 * 1000;// 延时函数，单位毫秒，这里是延时了5分钟
		SimpleDateFormat time2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String etime = time2.format(new Date(etime1));//
		String Random = String.valueOf(checkNum);
		try {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("etime", etime);
			jsonObject.put("Random", Random);
			// json random 过期时间
			// MsgSend1.msgSend(phone, Random);
			redisUtil.set("vlaueCode_" + phone, jsonObject.toString());
			result.put("code", "200");
		} catch (Exception e) {
			result.put("code", "201");
		}
		return result;
	}

	// 找回密码
	@RequestMapping(value = "retrievePassword")
	public Map<String, Object> retrievePassword(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String phone = request.getParameter("contactNumber");
		String check = request.getParameter("check");
		String password = request.getParameter("password");
		try {
			Object rab = redisUtil.get("vlaueCode_" + phone);
			String rabq = rab.toString();
			com.alibaba.fastjson.JSONObject object = JSON.parseObject(rabq);
			// 当前时间大于有效期 失效
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
			String ctime = df.format(new Date());// new Date()为获取当前系统时间
			String etime=(String)object.get("etime");
			String Random=(String)object.get("Random");
			System.out.println(Random);
			if (df.parse(ctime).getTime() > df.parse(etime).getTime()) {
				result.put("code", "203");
				result.put("message", "验证码失效，请重新获取");
			} else if (Random.equals(check)) {
				String endPassword = UserController.md5(password, phone);
				userService.updatePass(phone, endPassword);
				result.put("code", "200");
				result.put("message", "success");
			} else {
				result.put("code", "201");
				result.put("message", "验证码错误");
			}
		} catch (Exception e) {
			result.put("code", "202");
			result.put("message", "failed");
		}
		return result;
	}
}
