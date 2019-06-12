package com.htyw.app.utils;

import java.util.Calendar;


//生成工单编码
public class RepairNumber {

	public String createNumber(int number){
		Calendar time = Calendar.getInstance();
		int YEAR = time.get(Calendar.YEAR);//年
		String N = String.valueOf(YEAR);
		String MONTH = time.get(Calendar.MONTH) + 1 + "";//月
		if (Integer.parseInt(MONTH) >= 1 && Integer.parseInt(MONTH) <= 9){
			MONTH = "0" + String.valueOf(MONTH);
		}
		int RI = time.get(Calendar.DAY_OF_MONTH);//日
		String R = String.valueOf(RI);
		int H = time.get(Calendar.HOUR_OF_DAY);// 获取小时
		String S = String.valueOf(H);
		int M = time.get(Calendar.MINUTE);// 获取分钟
		String F = String.valueOf(M);
		int s = time.get(Calendar.SECOND);// 获取秒
		String m = String.valueOf(s);
		String order_type = "";
		if(number == 1){
			order_type = "BX";
		}
		if(number == 2){
			order_type = "TS";
		}
		if(number == 3){
			order_type = "YY";
		}
		return "GD-"+order_type+"-"+N+MONTH+R+S+F+m;

	}
	
}
