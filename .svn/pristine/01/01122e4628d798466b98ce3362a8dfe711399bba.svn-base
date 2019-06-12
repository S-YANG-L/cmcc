package com.htyw.app.timedTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.htyw.app.checkingIN.dao.CheckingInDateDao;
import com.htyw.app.checkingIN.pojo.CheckingInDate;

//考勤打卡每天自动插入日期
@Component
public class DateTimedTask {
	
	@Autowired
	private CheckingInDateDao checkingDao;
	
	//@Scheduled (cron = "0/2 * * * * ? ")// 间隔5秒执行
	 @Scheduled (cron = "0 0 1 * * ?")
	public void taskCycle() {
		//获取日期
		try {
			String timeDate = getDate();
			long ID = new Date().getTime();
			//插入日期基准表
			CheckingInDate checkingInDate = new CheckingInDate();
			checkingInDate.setId(ID);
			checkingInDate.setReferenceDate(timeDate);
			checkingDao.insert(checkingInDate);
			System.out.println(timeDate);
			System.out.println(ID);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	// 获取当前日期
	public String getDate() throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}













}
