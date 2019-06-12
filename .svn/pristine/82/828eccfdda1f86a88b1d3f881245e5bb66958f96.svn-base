package com.htyw.app.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;





import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class DocumentUtils {

	/**
	 * 将p4码转换为src
	 * @param request
	 * @param response
	 * @return
	 */
	public static String httpRespString(String batchno) {
//		String key = request.getParameter("batchno");
		String url = "http://106.74.146.162:9080/document/uploadfile/getfileinfo";
//		String url = "http://127.0.0.1:8085/document/uploadfile/getfileinfo";
		PostMethod post = new PostMethod(url);
		post.setParameter("batchno", batchno);
		String repsString = "";
		String filePath = "";
		//创建http请求
		HttpClient httpClient = new HttpClient();
	    try {
	    	httpClient.executeMethod(post);
		}catch(Exception e){
			System.out.println("***************获取失败");
			e.printStackTrace();
		}

		int code = post.getStatusCode();
		if (code == 200) {
			
			try {
				InputStream inputStream = post.getResponseBodyAsStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
				StringBuffer stringBuffer = new StringBuffer();
				String str = "";
				while ((str = br.readLine()) != null) {
					stringBuffer.append(str);
				}
				repsString = stringBuffer.toString();
				System.out.println("获取到的pc码======"+ repsString);
//				JSONArray jsonArr = JSONArray.parseArray(repsString);
				JSONObject jo = JSONObject.parseObject(repsString);
				String json = jo.getString("message");
				JSONArray jsonArr = JSONArray.parseArray(json);
				filePath = jsonArr.getJSONObject(0).getString("filePath");
				System.out.println("转换后的filePath======"+ filePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
		
		post.releaseConnection();
		return filePath;
	}
}
