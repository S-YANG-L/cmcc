package com.htyw.app.alipay;

import com.alibaba.fastjson.JSONObject;
public class ReturnObject {

	
	public String Response;

	public String getResponse() {
		return Response;
	}

	public void setResponse(String response) {
		Response = response;
	}
	

	public static void main(String[] args) {
		ReturnObject r=new ReturnObject();
		JSONObject j=(JSONObject) JSONObject.parse("{\"data\":\""+r.getResponse()+"\"}");
		System.out.println(j);
	}
}
