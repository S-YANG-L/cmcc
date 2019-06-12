package com.htyw.app.utils;

import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import com.alibaba.fastjson.JSONObject;

public class MsgSend1 {

	public static String msgSend(String phone, String cont) {
		String appKey = "0E3FADB6A87B41DEB582909DCD5D03B4";
		// 请求ID
		String requestId = UUID.randomUUID().toString();
		List<Object> smNeedDate = getSmNeedDate();
		// 时间戳
		String dateStr = (String) smNeedDate.get(0);
		Long date = (Long) smNeedDate.get(1);
		// 访问令牌
		String accessToken = MD5Util.encoderToMD5(appKey + date);
		String content = "";

		// 创建http请求
		HttpClient httpClient = new DefaultHttpClient();
		String url = "http://112.33.16.234:8081/ifp/IFPService";
		String json = "{  \n  \"action\":\"MsgSend\",\n  \"header\":{\n      \"requestId\":\"" + requestId
				+ "\",\n      \"timeStamp\":\"" + dateStr + "\",\n      \"accessToken\":\"" + accessToken
				+ "\",\n      \"appCode\":\"app_02\"\n    },\n    \"body\":{\n    \t\"receiverPhone\": \"" + phone
				+ "\",\n    \t\"content\": \"" + cont
				+ "\",\n\t\t\"scheduleSendTime\": \"\",\n    \t\"busTypeCode\": \"1\"\n    }\n}";
		HttpPost post = new HttpPost(url);
		post.setHeader("Content-Type", "application/json");
		post.setHeader("charset", "UTF-8");
		try {
			StringEntity str = new StringEntity(json, Charset.forName("UTF-8"));// json传递
			post.setEntity(str);
			HttpResponse res = httpClient.execute(post);
			content = JSONObject.toJSONString(res.getEntity()).toString();
			System.out.println("***************content=" + content);
		} catch (Exception e) {
			System.out.println("***************发送失败");
			e.printStackTrace();
		}
		return content;
	}

	public static List<Object> getSmNeedDate() {
		List<Object> ls = new ArrayList<Object>();
		String thisTime = findSystemDateString();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long millionSeconds = 0;
		try {
			millionSeconds = sdf.parse(thisTime).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ls.add(thisTime);//
		ls.add(millionSeconds);
		Date date = new Date();
		date.setTime(millionSeconds);
		ls.add(sdf.format(date));
		return ls;
	}

	public static String findSystemDateString(String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);// 可以方便地修改日期格式
		java.util.Date curTime = new java.util.Date(System.currentTimeMillis());
		java.sql.Timestamp sqlDate = new java.sql.Timestamp(curTime.getTime());
		return dateFormat.format(sqlDate);
	}

	public static String findSystemDateString() {
		return findSystemDateString("yyyy-MM-dd HH:mm:ss");
	}
}
