package com.htyw.app.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.token.pojo.TokenEntity;
import com.htyw.app.token.service.TokenService;
import com.htyw.app.user.pojo.RmUser;
import com.htyw.app.user.service.CustodianService;

@RestController
@RequestMapping("/CustodianLongin")
public class CustodianController {

	@Autowired
	private CustodianService custodianService;
	@Autowired
	private TokenService tokenService;

	// 登录
	@RequestMapping(value = "gologin", method = RequestMethod.POST)
	public Map<String, Object> getPassById(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		// 加密密码
		String passwords = UserController.md5(password, account);
		System.out.println("加密后=" + passwords);
		try {
			RmUser user = custodianService.selectByPassword(account, passwords);
			if (null != user) {
				String userName = user.getName();
				String token = tokenService.generateToken(account, userName);
				tokenService.saveCustodianToken(token, user);
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
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "202");
			result.put("message", "failed");
		}
		return result;
	}

	// 获取user
	@RequestMapping(value = "getUser", method = RequestMethod.POST)
	public Map<String, Object> getUser(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String id = request.getParameter("id");
			RmUser user = custodianService.getUser(Long.parseLong(id));
			result.put("user", user);
			result.put("code", "200");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "202");
			result.put("message", "系统开小差了请稍后重试");
			return result;
		}
	}

	// 修改密码
	@RequestMapping(value = "updateMaterisl", method = RequestMethod.POST)
	public Map<String, Object> updateMaterisl(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String loginId = request.getParameter("loginId");
			String oldPassword = request.getParameter("oldPassword");
			String newPassword = request.getParameter("newPassword");
			// 加密密码
			String passwords = UserController.md5(oldPassword, loginId);
			System.out.println(passwords);
			RmUser user = custodianService.selectByPassword(loginId, passwords);
			if (null != user) {
				// 加密新密码
				String endPassword = UserController.md5(newPassword, loginId);
				int i = custodianService.updatePass(loginId, endPassword);
				if (i == 1) {
					user = custodianService.selectByPassword(loginId, endPassword);
					String userName = user.getName();
					String token = tokenService.generateToken(loginId, userName);
					tokenService.saveCustodianToken(token, user);
					TokenEntity entity = new TokenEntity();// 报错
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
				}
			} else {
				result.put("code", "202");
				result.put("message", "初始密码错误");
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "202");
			result.put("message", "系统开小差了请稍后重试");
			return result;
		}

	}

}
