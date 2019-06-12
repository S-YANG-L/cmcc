package com.htyw.app.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

/**
 * 读取多个properties配置文件
* @ClassName PropertyFileUtil 
* @author 博超
* @date 2017年3月9日
 */
public class PropertyFileUtil {

	private static Properties prop = null;

	private enum PropertyFile{
		//配置文件枚举列表
		application("application.properties"),
		api("api.properties");
		
		private final String path;
		
		private PropertyFile(String _path){
			this.path = _path;
		}
	}
	
	static {
		init();
	}

	private static void init() {
		prop = new Properties();
		loadData();
	}

	private static void loadData() {
		InputStream in = null;
		try {
			for (PropertyFile file : PropertyFile.values()) {
				in = Thread.currentThread().getContextClassLoader().getResourceAsStream(file.path);
				if (in != null) {
					prop.load(in);
				}
			}
			return;
		} catch (IOException e) {
			System.out.println("加载 properties文件失败" + e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					System.out.println("关闭输入流失败" + e);
				}
			}
		}
	}

	public static String getValue(String key) {
		String value = prop.getProperty(key);
		return StringUtils.isBlank(value) ? "" : value;
	}

	public static String getValue(String key, String defaultValue) {
		String value = prop.getProperty(key);
		return StringUtils.isBlank(value) ? defaultValue : value;
	}


}
