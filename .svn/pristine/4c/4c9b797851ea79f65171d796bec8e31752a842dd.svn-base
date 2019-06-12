package com.htyw.app.utils;

import java.util.Calendar;
import java.util.Random;

public class IDUtis {

	public static String getUUID() {

		StringBuilder str=new StringBuilder();//定义变长字符串
		Random random=new Random();
		//随机生成数字，并添加到字符串
		for(int i=0;i<2;i++){
		    str.append(random.nextInt(10));
		}
		return getTime() + str;
	}

	public static String getTime() {
		Calendar time = Calendar.getInstance();
		int YEAR = time.get(Calendar.YEAR);//年
		String N = String.valueOf(YEAR);
		int MONTH = time.get(Calendar.MONTH) + 1;//月
		String Y = String.valueOf(MONTH);
		int RI = time.get(Calendar.DAY_OF_MONTH);//日
		String R = String.valueOf(RI);
		int H = time.get(Calendar.HOUR_OF_DAY);// 获取小时
		String S = String.valueOf(H);
		int M = time.get(Calendar.MINUTE);// 获取分钟
		String F = String.valueOf(M);
		int s = time.get(Calendar.SECOND);// 获取秒
		String m = String.valueOf(s);
		return N+Y+R+S+F+m;
	}
	
	public static void main(String[] args) {
		System.out.println(getUUID());
	}
}
