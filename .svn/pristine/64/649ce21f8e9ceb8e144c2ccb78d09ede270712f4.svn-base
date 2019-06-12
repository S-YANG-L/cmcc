package com.htyw.app.token.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.htyw.app.user.pojo.RmUser;
import com.htyw.app.user.pojo.User;
import com.htyw.app.utils.MD5Util;
import com.htyw.app.utils.RedisUtil;


@Service("tokenService")
public class TokenService {
	
	 @Autowired
	 private RedisUtil redisUtil;
	  
	 /*   public TokenService(){
	        try {
				init();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	 
	    private void init() {
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	        redisUtil = (RedisUtil)applicationContext.getBean("redisUtil");
	    }*/
	 
	    //生成token(格式为token=手机号)
	    public String generateToken(String phone, String userName){
	        StringBuilder token = new StringBuilder();
	        Long Now = System.currentTimeMillis();
	        //加密手机号+用户名+当前时间戳
	        String result =  MD5Util.getStringMD5(phone+userName+Now);
	        //加token:
	        //token.append("token=");
	        token.append(result);
	        System.out.println("token=>" + token.toString());
	        return token.toString();
	    }
	 
	    //保存token
	    public void saveToken(String token, User user){
	    	String jsonUser = JSONObject.toJSONString(user, true);
	    	System.out.println("转换后的user字符串为："+jsonUser);
	        redisUtil.set(token, jsonUser);
	    }
	    //保存管理人员token
	    public void saveCustodianToken(String token, RmUser user){
	    	String jsonUser = JSONObject.toJSONString(user, true);
	    	System.out.println("转换后的user字符串为："+jsonUser);
	    	redisUtil.set(token, jsonUser);
	    }
	    
	    //检查token
	    public String checkToken(Long tokenExpiryTime, String token){
	    	String msg = "true";
	    	Long Now = System.currentTimeMillis();
	    	//判断失效时间
	    	if(Now > tokenExpiryTime){
	    		msg = "false";
	    	}else{
	    		//判断token是否存在
	    		Object user = redisUtil.get(token);
	    		if(null == user){
	    			msg = "false";
	    		}
	    	}
	    	return msg;
	    }
}
