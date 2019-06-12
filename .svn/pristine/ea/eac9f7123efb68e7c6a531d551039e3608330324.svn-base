package com.htyw.app.checkingIN.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.checkingIN.dao.CheckingInClockDao;
import com.htyw.app.checkingIN.pojo.CheckingInClock;
import com.htyw.app.checkingIN.pojo.CheckingInMend;
import com.htyw.app.checkingIN.pojo.UserChecking;
import com.htyw.app.checkingIN.service.CheckingINService;

@RestController
@RequestMapping("/checkingin")
public class CheckingINController {
	@Autowired
	private CheckingINService checkingService;
	@Autowired
	private CheckingInClockDao checkDao;

	// 判断是否在打卡位置
	@RequestMapping(value = "judgeClockIn", method = RequestMethod.POST)
	public Map<String, Object> judgeClockIn(HttpServletRequest request, HttpServletResponse response) {
		UserChecking user = new UserChecking();
		user.setUserName(request.getParameter("userName"));
		user.setTENANTID(request.getParameter("TENANTID"));
		//user.setCheckLocation(request.getParameter("checkLocation"));
		user.setUserId(request.getParameter("userId"));
		user.setLongitude(request.getParameter("longitude"));
		user.setLatitude(request.getParameter("latitude"));
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			result = checkingService.judgeClockIn(user);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "暂时不可打卡");
			return result;
		}

	}

	// 内勤打卡
	@RequestMapping(value = "interiorClockIn", method = RequestMethod.POST)
	public Map<String, Object> interiorClockIn(String staffId, String staffName, String tenantId, String location) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			// 获取当前时间
			String time = getTime();
			// Integer APandAM = morningAndAfternoon();
			String state = checkingService.interiorClockIn(staffId, staffName, time, tenantId, location);
			result.put("state", state);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "暂时不可打卡,请稍后再试");
			return result;
		}
	}

	// 外勤打卡
	@RequestMapping(value = "itinerancy", method = RequestMethod.POST)
	public Map<String, Object> itInerancy(HttpServletRequest request, HttpServletResponse response) {
		CheckingInClock inClock = new CheckingInClock();
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			inClock.setOfficeHours(getDate(request.getParameter("officeHours")));// 开始时间
			inClock.setClosingTime(getDate(request.getParameter("closingTime")));// 结束时间
			inClock.setName(request.getParameter("name"));// 员工姓名
			inClock.setLocation(request.getParameter("location"));// 打卡位置
			inClock.setOutworkCause(request.getParameter("outworkCause"));// 外勤原因
			inClock.setStaffId(Long.parseLong(request.getParameter("userId")));// 员工id
			inClock.setTenantid(Long.parseLong(request.getParameter("tenantId")));// 租户id
			String state = checkingService.itInerancy(inClock);
			result.put("state", state);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	
	//查询异常考勤新
	@RequestMapping(value = "getabnormal", method = RequestMethod.POST)
	public Map<String, Object> getAbnormal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CheckingInClock inClock = new CheckingInClock();
		inClock.setStaffId(Long.parseLong(request.getParameter("staffId")));
		inClock.setTenantid(Long.parseLong(request.getParameter("tenantId")));
		inClock.setName(request.getParameter("staffName"));
		System.out.println(request.getParameter("staffName"));
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			List<CheckingInClock> yichangList = checkingService.getCheckAbnormal(inClock);
			ArrayList<CheckingInClock> reList = new ArrayList<CheckingInClock>();
			for (CheckingInClock yichang : yichangList) {

				if (yichang.getId() != null) {

					if (yichang.getName() == null) {
						yichang.setName(inClock.getName());
					}
					if (yichang.getLeaveEarly() == null) {// 早退状态
						yichang.setLeaveEarly("");
					}
					if (("0").equals(yichang.getLeaveEarly())) {// 正常
						yichang.setLeaveEarly("正常");
					}
					if (("1").equals(yichang.getLeaveEarly())) {// 早退
						yichang.setLeaveEarly("早退");
						//yichang.setAbnormalState("早退");
					}
					if (("2").equals(yichang.getLeaveEarly())) {// 早退
						yichang.setLeaveEarly("下班未打卡");
						//yichang.setAbnormalState("早退");
					}
					if (yichang.getState() == null) {// 迟到迟到
						yichang.setState("");
					}
					if (("1").equals(yichang.getState())) {// 正常
						yichang.setState("正常");
					}
					if (("0").equals(yichang.getState())) {// 迟到
						yichang.setState("迟到");
						//checkingInAbnormal.setAbnormalState("迟到");
					}
					if (("2").equals(yichang.getState())) {// 未打卡
						yichang.setState("上班未打卡");
						//checkingInAbnormal.setAbnormalState("未打卡");
					}
					if (yichang.getAuditState() == null) {// 审批状态
						yichang.setAuditState("");
					}
					if (("0").equals(yichang.getAuditState())) {// 审批状态
						yichang.setAuditState("待补录");
					}
					if (("1").equals(yichang.getAuditState())) {// 审批状态
						yichang.setAuditState("待审批");
					}
					if (("2").equals(yichang.getAuditState())) {// 审批状态
						yichang.setAuditState("通过");
					}
					reList.add(yichang);
				}
			
			}
			result.put("state", "200");
			result.put("abnormal", reList);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}
	
	
	
	
	
	
	
	
	
	// 处理单条异常考勤
	@RequestMapping(value = "disposeonlyabnormal", method = RequestMethod.POST)
	public Map<String, Object> disposeOnlyAbnormal(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String stat = checkingService.disposeOnlyAbnormal(Long.parseLong(request.getParameter("clockId")),Long.parseLong(request.getParameter("tenantId")),Long.parseLong(request.getParameter("staffId")));
			result.put("state", stat);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 批量补录考勤
	@RequestMapping(value = "disposebatchabnormal", method = RequestMethod.POST)
	public Map<String, Object> disposeBatchAbnormal(HttpServletRequest request, HttpServletResponse response) {
		CheckingInMend inMend = new CheckingInMend();
		Map<String, Object> result = new HashMap<String, Object>();
		try {
		inMend.setVacateName(request.getParameter("staffName"));
		inMend.setTenantid(Long.parseLong((request.getParameter("tenantId"))));
		inMend.setVacateType(request.getParameter("leaveGenre"));
		inMend.setStartTime(getDate(request.getParameter("start")));
		inMend.setFinishTime(getDate(request.getParameter("end")));
		inMend.setVacateCause(request.getParameter("cause"));
		inMend.setCheckingInClockIds(request.getParameter("checkids"));
		String staffId = request.getParameter("staffId");
			String stat = checkingService.disposeBatchAbnormal(inMend ,staffId);
			result.put("state", stat);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}
	
	//判断是否正在处于审批
	@RequestMapping(value = "judgestate", method = RequestMethod.POST)
	public Map<String, Object> judgeState(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String idS = request.getParameter("ids");
			String[] ID = idS.split(",");
			for (String id : ID) {
				CheckingInClock clock = checkDao.selectByPrimaryKey(Long.parseLong(id));
				if (!"0".equals(clock.getAuditState())) {
					result.put("state", "300");
					return result;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "300");
			return result;
		}
		result.put("state", "200");
		return result;
	}

	// 单个每天员工打卡信息
	@RequestMapping(value = "onlyClockIn", method = RequestMethod.POST)
	public Map<String, Object> onlyClockIn(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {

			String staffId = request.getParameter("staffId");// 员工id
			String tenantId = request.getParameter("tenantId");// 租户id
			CheckingInClock clock = checkingService.onlyClockIn(staffId, tenantId);
			if (null != clock) {
				result.put("state", "1");// 获取成功
				result.put("clock", clock);
				return result;
			} else {
				result.put("state", "当前无打卡信息");
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	//考勤详情
	@RequestMapping(value = "particulars", method = RequestMethod.POST)
	public Map<String, Object> particulars(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String staffId = request.getParameter("staffId");// 员工id
			String tenantId = request.getParameter("tenantId");
			CheckingInClock inClock = new CheckingInClock();
			inClock.setStaffId(Long.parseLong(staffId));
			inClock.setTenantid(Long.parseLong(tenantId));
			String checkDate = request.getParameter("checkDate");
			if(checkDate.equals("") || checkDate == null){
				inClock.setCheckingInDate(GetNowYue());
			}else{
				inClock.setCheckingInDate(checkDate);
			}
			List<CheckingInClock> clockList= checkingService.getParticulars(inClock);
			if (clockList.size()==0) {
				result.put("state", "当前无考勤信息");
			}
			ArrayList<CheckingInClock> reList = new ArrayList<CheckingInClock>();
			for (CheckingInClock InClock : clockList) {
				if(InClock.getLocation() == null){
					InClock.setLocation("");
				}
				if("0".equals(InClock.getState())){
					InClock.setState("迟到");
				}
				if(null==InClock.getState()){
					InClock.setState("");
				}
				if("1".equals(InClock.getState())){
					InClock.setState("正常");
				}
				if("2".equals(InClock.getState())){
					InClock.setState("上班未打卡");
				}
				if("0".equals(InClock.getLeaveEarly())){
					InClock.setLeaveEarly("正常");
				}
				if("1".equals(InClock.getLeaveEarly())){
					InClock.setLeaveEarly("早退");
				}
				if("2".equals(InClock.getLeaveEarly())){
					InClock.setLeaveEarly("下班未打卡");
				}
				if(null==InClock.getLeaveEarly()){
					InClock.setLeaveEarly("下班未打卡");
				}
				if(null==InClock.getClosingTime()){
					InClock.setClosingTime(getDate("00:00"));
				}
				if (InClock.getAuditState() == null) {// 审批状态
					InClock.setAuditState("");
				}
				if (("0").equals(InClock.getAuditState())) {// 审批状态
					InClock.setAuditState("待补录");
				}
				if (("1").equals(InClock.getAuditState())) {// 审批状态
					InClock.setAuditState("待审批");
				}
				if (("2").equals(InClock.getAuditState())) {// 审批状态
					InClock.setAuditState("通过");
				}
				if ("正常".equals(InClock.getLeaveEarly())) {// 正常
					if("正常".equals(InClock.getState())){
						InClock.setAuditState("正常");
					}
				}
				reList.add(InClock);
			}
			result.put("state", "200");
			result.put("clockList", reList);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
		return result;
	}
	//条件查询
	@RequestMapping(value = "getSousuo", method = RequestMethod.POST)
	public Map<String, Object> getSousuo(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String staffId = request.getParameter("staffId");// 员工id
			String tenantId = request.getParameter("tenantId");
			String stare ="";
			stare = request.getParameter("stare");//开始
			String end ="";
			end = request.getParameter("end");//结束
			if("".equals(stare) || null==stare){
				stare="1000-01-01";
			}
			if("".equals(end) || null==end){
				end="9999-12-31";
			}
			List<CheckingInClock> clockList= checkingService.getSousuo(Long.parseLong(staffId),Long.parseLong(tenantId),stare,end);
			if (clockList.size()==0) {
				result.put("state", "当前无考勤信息");
			}
			ArrayList<CheckingInClock> reList = new ArrayList<CheckingInClock>();
			for (CheckingInClock InClock : clockList) {
				if(InClock.getLocation() == null){
					InClock.setLocation("");
				}
				if("0".equals(InClock.getState())){
					InClock.setState("迟到");
				}
				if(null==InClock.getState()){
					InClock.setState("");
				}
				if("1".equals(InClock.getState())){
					InClock.setState("正常");
				}
				if("2".equals(InClock.getState())){
					InClock.setState("上班未打卡");
				}
				if("0".equals(InClock.getLeaveEarly())){
					InClock.setLeaveEarly("正常");
				}
				if("1".equals(InClock.getLeaveEarly())){
					InClock.setLeaveEarly("早退");
				}
				if("2".equals(InClock.getLeaveEarly())){
					InClock.setLeaveEarly("下班未打卡");
				}
				if(null==InClock.getLeaveEarly()){
					InClock.setLeaveEarly("下班未打卡");
				}
				if(null==InClock.getClosingTime()){
					InClock.setClosingTime(getDate("00:00"));
				}
				if (InClock.getAuditState() == null) {// 审批状态
					InClock.setAuditState("");
				}
				if (("0").equals(InClock.getAuditState())) {// 审批状态
					InClock.setAuditState("待补录");
				}
				if (("1").equals(InClock.getAuditState())) {// 审批状态
					InClock.setAuditState("待审批");
				}
				if (("2").equals(InClock.getAuditState())) {// 审批状态
					InClock.setAuditState("通过");
				}
				if ("正常".equals(InClock.getLeaveEarly())) {// 正常
					if("正常".equals(InClock.getState())){
						InClock.setAuditState("正常");
					}
				}
				reList.add(InClock);
			}
			result.put("state", "200");
			result.put("clockList", reList);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
		return result;
	}
	
	
	// 获取当前时间
	public String getTime() {
		Calendar time = Calendar.getInstance();
		time.get(Calendar.HOUR_OF_DAY);// 获取小时
		time.get(Calendar.MINUTE);// 获取分钟
		time.get(Calendar.SECOND);// 获取秒
		return time.get(Calendar.HOUR_OF_DAY) + ":" + time.get(Calendar.MINUTE) + ":" + time.get(Calendar.SECOND);
	}

	// 获取当前为上午或下午
	public Integer morningAndAfternoon() {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.get(GregorianCalendar.AM_PM);
	}

	// 获取详细时间
	public String GetNowDate() {
		String temp_str = "";
		Date dt = new Date();
		// 最后的aa表示“上午”或“下午” HH表示24小时制 如果换成hh表示12小时制
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		temp_str = sdf.format(dt);
		return temp_str;
	}
	// 获取详细月
	public String GetNowYue() {
		String temp_str = "";
		Date dt = new Date();
		// 最后的aa表示“上午”或“下午” HH表示24小时制 如果换成hh表示12小时制
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		temp_str = sdf.format(dt);
		return temp_str;
	}

	// String 转为date
	public Date getDate(String str) throws ParseException {
		DateFormat format = new SimpleDateFormat("HH:mm");
		return format.parse(str);
	}

}
