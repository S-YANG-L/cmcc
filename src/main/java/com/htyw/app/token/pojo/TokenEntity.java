package com.htyw.app.token.pojo;

import com.htyw.app.user.pojo.User;

public class TokenEntity {
	private String token;
	 
    //token创建时间
    private Long tokenCreatedTime;
 
    //失效时间
    private Long tokenExpiryTime;
 
    private User USER;
    
    private String isLogin;
 
    public String getToken() {
        return token;
    }
 
    
    public User getUSER() {
		return USER;
	}


	public void setUSER(User uSER) {
		USER = uSER;
	}


	public void setToken(String token) {
        this.token = token;
    }
 
    public Long getTokenCreatedTime() {
        return tokenCreatedTime;
    }
 
    public void setTokenCreatedTime(Long tokenCreatedTime) {
        this.tokenCreatedTime = tokenCreatedTime;
    }
 
    public Long getTokenExpiryTime() {
        return tokenExpiryTime;
    }
 
    public void setTokenExpiryTime(Long tokenExpiryTime) {
        this.tokenExpiryTime = tokenExpiryTime;
    }
 
    public String getIsLogin() {
        return isLogin;
    }
 
    public void setIsLogin(String isLogin) {
        this.isLogin = isLogin;
    
    }
}
