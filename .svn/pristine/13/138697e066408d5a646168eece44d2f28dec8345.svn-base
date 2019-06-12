package com.htyw.app.checkingIN.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.checkingIN.dao.CheckingInAbnormalDao;
import com.htyw.app.checkingIN.dao.CheckingInClockDao;
import com.htyw.app.checkingIN.dao.CheckingInConfigurationDao;
import com.htyw.app.checkingIN.dao.CheckingInDateDao;
import com.htyw.app.checkingIN.dao.CheckingInMendDao;
import com.htyw.app.checkingIN.pojo.CheckingInAbnormal;
import com.htyw.app.checkingIN.pojo.CheckingInClock;
import com.htyw.app.checkingIN.pojo.CheckingInConfiguration;
import com.htyw.app.checkingIN.pojo.CheckingInDate;
import com.htyw.app.checkingIN.pojo.CheckingInDateExample;
import com.htyw.app.checkingIN.pojo.CheckingInMend;
import com.htyw.app.checkingIN.pojo.UserChecking;
import com.htyw.app.utils.IDUtis;
import com.htyw.app.utils.MapUtils;

@Service
@Transactional
public class CheckingINService {

	@Autowired
	private CheckingInConfigurationDao checkingInConfigurationDao;// 基础配置
	@Autowired
	private CheckingInDateDao ckiDateDao;// 日期基准
	@Autowired
	private CheckingInClockDao ckiClockDao;// 打卡
	@Autowired
	private CheckingInAbnormalDao ckiAbnormalDao;// 异常打卡
	@Autowired
	private CheckingInMendDao ckiMendDao;// 考勤补录单

	// 判断是否在打卡范围内
	public Map<String, Object> judgeClockIn(UserChecking user) {
		HashMap<String, Object> reHashMap = new HashMap<String, Object>();
		try {
			// int i= 1/0;
			// 将页面经纬度转为double
			double Ylongitude = Double.parseDouble(user.getLongitude());// 精度
			double Ylatitude = Double.parseDouble(user.getLatitude());// 维度
			// 获取进出表中的经纬度
			List<CheckingInConfiguration> checkingInConfigurationList = checkingInConfigurationDao
					.selectJingWeiDu(Long.parseLong(user.getTENANTID()));
			for (int i = 0; i < checkingInConfigurationList.size(); i++) {
				double Klongitude = Double.parseDouble(checkingInConfigurationList.get(i).getLongitude());// 经度
				double Klatitude = Double.parseDouble(checkingInConfigurationList.get(i).getLatitude());// 维度
				double locationScope = Double.parseDouble(checkingInConfigurationList.get(i).getLocationScope());// 范围距离
				// 判断是否在打卡位置
				//if (user.getCheckLocation().equals(checkingInConfigurationList.get(i).getLocation())) {
					// 判断经纬度是否在范围内
					double distance = MapUtils.GetDistance(Ylatitude, Ylongitude, Klatitude, Klongitude);
					System.out.println("打卡范围======================>"+distance);
					if (distance < locationScope) {// 可以打卡
						reHashMap.put("state", "1");
						reHashMap.put("location", checkingInConfigurationList.get(i).getLocation());
					} else {
						reHashMap.put("state", "0");
					}
				//} else {
					//reHashMap.put("state", "0");
				//}

			}
		} catch (Exception e) {
			e.printStackTrace();
			reHashMap.put("state", "位置信息获取失败");
		}

		return reHashMap;

	}

	// 内勤打卡
	public String interiorClockIn(String staffId, String staffName, String time, String tenantId, String location) {
		String stat = "打卡失败请联系管理员";
		try {
			// int i= 1/0;
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Date realityTime = sdf.parse(time);
			// 获取日期基础表的id
			CheckingInDateExample query = new CheckingInDateExample();
			CheckingInDateExample.Criteria criteria = query.createCriteria();
			// 根据时间查询
			criteria.andReferenceDateEqualTo(getDate());
			List<CheckingInDate> selectByExample = ckiDateDao.selectByExample(query);
			CheckingInDate checkingInDate = selectByExample.get(0);
			Long checkingInDateId = checkingInDate.getId();

			// 查询打卡次数
			List<CheckingInClock> clockList = ckiClockDao.checkNumber(Long.parseLong(staffId) , Long.parseLong(tenantId),getDate());
			// 判断是否首次打卡
			if (clockList.size() == 0) {// 首次打卡
				// 查询上班时间
				List<CheckingInConfiguration> checkingInConfigurationList = checkingInConfigurationDao
						.selectByExample(null);
				Date officeHours = checkingInConfigurationList.get(0).getOfficeHours();
				// 判断是否迟到
				if (realityTime.getTime() < officeHours.getTime()) {// 上班打卡
					CheckingInClock inClock = new CheckingInClock();// 创建打卡对象
					inClock.setId(new Date().getTime());// 添加ID
					inClock.setOfficeHours(realityTime);// 上班时间
					inClock.setState("1");// 设置打卡状态为正常(1)
					inClock.setName(staffName);// 员工姓名
					inClock.setClosingTime(sdf.parse("00:00:00"));// 初始下班时间
					inClock.setLeaveEarly("2");// 初始下班未打卡
					inClock.setStaffId(Long.parseLong(staffId));// 员工id
					inClock.setCheckingInDateId(checkingInDateId);// 日期基础表
					inClock.setOutworker("1");// 设置内勤(1)
					inClock.setTenantid(Long.parseLong(tenantId));// 设置租户id
					inClock.setClockInTime("1");// 设置打卡次数
					inClock.setLocation(location);// 打卡地址
					inClock.setCheckingInDate(getDate());// 打卡日期
					inClock.setAuditState("0");// 审批状态
					int insert = ckiClockDao.insert(inClock);// 保存
					if (insert > 0) {
						return stat = "上班打卡成功";
					}
				} else {// 迟到
					CheckingInClock inClock = new CheckingInClock();// 创建打卡对象
					inClock.setId(new Date().getTime());// 添加ID
					inClock.setOfficeHours(realityTime);// 上班时间
					inClock.setClosingTime(sdf.parse("00:00:00"));// 初始下班时间
					inClock.setLeaveEarly("2");// 初始下班未打卡
					inClock.setState("0");// 设置打卡状态为迟到(0)
					inClock.setName(staffName);// 员工姓名
					inClock.setStaffId(Long.parseLong(staffId));// 员工id
					inClock.setCheckingInDateId(checkingInDateId);// 日期基础表
					inClock.setOutworker("1");// 设置内勤(1)
					inClock.setTenantid(Long.parseLong(tenantId));// 设置租户id
					inClock.setClockInTime("1");// 设置打卡次数
					inClock.setLocation(location);// 打卡地址
					inClock.setCheckingInDate(getDate());// 打卡日期
					inClock.setAuditState("0");// 审批状态
					int insert = ckiClockDao.insert(inClock);// 保存
					if (insert > 0) {
						return stat = "上班打卡成功,您已迟到";
					}
				}
			} else if ("2".equals(clockList.get(0).getState())) {//有打卡记录的上班打卡
				// 查询上班时间
				List<CheckingInConfiguration> checkingInConfigurationList = checkingInConfigurationDao
						.selectByExample(null);
				Date officeHours = checkingInConfigurationList.get(0).getOfficeHours();
				if (realityTime.getTime() < officeHours.getTime()) {//正常
					CheckingInClock inClock = new CheckingInClock();// 创建打卡对象
					Long id = Long.parseLong(clockList.get(0).getId());
					inClock.setId(id);// 添加ID
					inClock.setOfficeHours(realityTime);// 上班时间
					inClock.setState("1");// 设置打卡状态为正常(1)
					inClock.setClosingTime(sdf.parse("00:00:00"));// 初始下班时间
					inClock.setLeaveEarly("2");// 初始下班未打卡
					inClock.setOutworker("1");// 设置内勤(1)
					inClock.setClockInTime("1");// 设置打卡次数
					inClock.setLocation(location);// 打卡地址
					inClock.setAuditState("0");// 审批状态
					inClock.setTenantid(Long.parseLong(tenantId));
					inClock.setStaffId(Long.parseLong(staffId));
					int insert = ckiClockDao.updateByPrimaryKeySelective(inClock);// 修改上班状态
					if (insert > 0) {
						return stat = "上班打卡成功";
					}
					
				}else{//迟到
					CheckingInClock inClock = new CheckingInClock();// 创建打卡对象
					Long id = Long.parseLong(clockList.get(0).getId());
					inClock.setId(id);// 添加ID
					inClock.setOfficeHours(realityTime);// 上班时间
					inClock.setState("0");// 设置打卡状态为早退0
					inClock.setClosingTime(sdf.parse("00:00:00"));// 初始下班时间
					inClock.setLeaveEarly("2");// 初始下班未打卡
					inClock.setOutworker("1");// 设置内勤(1)
					inClock.setClockInTime("1");// 设置打卡次数
					inClock.setLocation(location);// 打卡地址
					inClock.setAuditState("0");// 审批状态
					inClock.setTenantid(Long.parseLong(tenantId));
					inClock.setStaffId(Long.parseLong(staffId));
					int insert = ckiClockDao.updateByPrimaryKeySelective(inClock);// 修改上班状态
					if (insert > 0) {
						return stat = "上班打卡成功,您已迟到";
					}
				}
			}else {// 下班打卡
				//String clockInTime = clockList.get(0).getClockInTime();
				Long id = Long.parseLong(clockList.get(0).getId());
				//if ("1".equals(clockInTime)) {// 下班打卡
					// 查询下班时间
					List<CheckingInConfiguration> checkingInConfigurationList = checkingInConfigurationDao
							.selectByExample(null);
					Date closingTime = checkingInConfigurationList.get(0).getClosingTime();
					// 判断是否早退 LEAVE_EARLY 0否 1是
					if (realityTime.getTime() > closingTime.getTime()) {// 没有早退
						CheckingInClock inClock = new CheckingInClock();// 创建打卡对象
						inClock.setId(id);// 添加ID
						inClock.setClosingTime(realityTime);// 下班时间
						//inClock.setOfficeHours(sdf.parse("00:00:00"));// 初始上班时间
						inClock.setLeaveEarly("0");// 设置早退状态
						inClock.setClockInTime("2");// 设置打卡次数
						inClock.setTenantid(Long.parseLong(tenantId));
						inClock.setStaffId(Long.parseLong(staffId));
						int insert = ckiClockDao.updateByPrimaryKeySelective(inClock);// 修改下班状态
						if (insert > 0) {
							return stat = "下班打卡成功";
						}
					} else {// 早退
						CheckingInClock inClock = new CheckingInClock();// 创建打卡对象
						inClock.setId(id);// 添加ID
						inClock.setClosingTime(realityTime);// 下班时间
						//inClock.setOfficeHours(sdf.parse("00:00:00"));// 初始上班时间
						inClock.setLeaveEarly("1");// 设置早退状态
						inClock.setClockInTime("2");// 设置打卡次数
						inClock.setTenantid(Long.parseLong(tenantId));
						inClock.setStaffId(Long.parseLong(staffId));
						int insert = ckiClockDao.updateByPrimaryKeySelective(inClock);// 修改下班状态
						if (insert > 0) {
							return stat = "下班打卡成功,早退";
						}
					}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return stat;
	}

	// 外勤打卡
	public String itInerancy(CheckingInClock inClock) {
		String stat = "外勤打卡失败请联系管理员";
		try {
			// 获取日期基础表的id
			CheckingInDateExample query = new CheckingInDateExample();
			CheckingInDateExample.Criteria criteria = query.createCriteria();
			// 根据时间查询
			criteria.andReferenceDateEqualTo(getDate());
			List<CheckingInDate> selectByExample = ckiDateDao.selectByExample(query);
			for (int i = 0; i < selectByExample.size(); i++) {
				String referenceDate = selectByExample.get(i).getReferenceDate();
				if (referenceDate.equals(getDate())) {
					inClock.setCheckingInDateId(selectByExample.get(i).getId());
				}
			}
			inClock.setId(new Date().getTime());
			inClock.setOutworker("2");// 外勤
			inClock.setClockInTime("2");// 打卡次数
			inClock.setCheckingInDate(getDate());// 打卡日期
			int insert = ckiClockDao.insert(inClock);
			if (insert > 0) {
				stat = "外勤打卡成功";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stat;
	}

	
	
	//获取异常考勤新
	public List<CheckingInClock> getCheckAbnormal(CheckingInClock inClock) throws Exception {
		// 未打卡
				List<CheckingInAbnormal> reList = ckiAbnormalDao.getAbnormal(Long.parseLong(inClock.getStaffId()));// inClock.getStaffId()Long.parseLong("1")
				if (reList.size() > 0) {
					for (CheckingInAbnormal checkingInAbnormal : reList) {
						// Long staffId = checkingInAbnormal.getStaffId();
						if (null == checkingInAbnormal.getName()) {
							System.out.println(inClock.getName());
							// 创建打卡对象保存到数据库
							CheckingInClock checkingInClock = new CheckingInClock();
							SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
							checkingInClock.setId(Long.valueOf(IDUtis.getUUID()));// 主键
							checkingInClock.setOfficeHours(sdf.parse("00:00:00"));// 上班
							checkingInClock.setClosingTime(sdf.parse("00:00:00"));// 下班
							checkingInClock.setTenantid(Long.parseLong(inClock.getTenantid()));// 租户id
							checkingInClock.setStaffId(Long.parseLong(inClock.getStaffId()));// 员工id
							checkingInClock.setName(inClock.getName());// 员工姓名
							checkingInClock.setAuditState("0");// 审核状态 1待审
							checkingInClock.setClockInTime("0");// 设置未打卡状态
							checkingInClock.setState("2");// 设置上班未打卡
							checkingInClock.setLeaveEarly("2");// 设置下班未打卡
							checkingInClock.setCheckingInDateId(checkingInAbnormal.getId());// 打卡日期id
							checkingInClock.setCheckingInDate(checkingInAbnormal.getReferenceDate());// 打卡日期
							ckiClockDao.insertSelective(checkingInClock);
						}
					}
				}
		//获取异常考勤
		List<CheckingInClock> yichangList = ckiClockDao.getYichang(Long.parseLong(inClock.getStaffId()));
		return yichangList;
	}

	// 批量补考勤
	public String disposeBatchAbnormal(CheckingInMend inMend ,String staffId) {
		String stat = "考勤补录成功 请耐心等待审核";
		try {
			// 获取所选的员工打卡记录id
			String[] IdS = inMend.getCheckingInClockIds().split(",");
			if (IdS.length > 0) {
				// 保存考勤补录单
				inMend.setId(Long.parseLong(IDUtis.getUUID()));
				inMend.setStatus("1");
				int insertSelective = ckiMendDao.insertSelective(inMend);
				if (insertSelective > 0) {
					//修改
					for (String id : IdS) {
						CheckingInClock inClock = new CheckingInClock();
						inClock.setId(Long.parseLong(id));
						inClock.setAuditState("1");
						inClock.setTenantid(inMend.getTenantid());
						inClock.setStaffId(Long.parseLong(staffId));
						ckiClockDao.updateByPrimaryKeySelective(inClock);
					}
				}
			} else {// 没有考勤
				stat = "请至少选择一条异常考勤";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return stat;
	}

	// 单个每天打卡情况
	public CheckingInClock onlyClockIn(String staffId, String tenantId) throws ParseException {
		// 查询日期id
		CheckingInDate inDate = ckiDateDao.selectByDate(getDate());
		CheckingInClock clock = ckiClockDao.selectByOlyn(Long.parseLong(staffId), Long.parseLong(tenantId),
				inDate.getId());
		if (null != clock) {
			clock.setCheckingInDate(getDate());// 加入当前日期
		}
		return clock;
	}

	// 获取当前日期
	public String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new Date());
	}
	//考勤详情
	public List<CheckingInClock> getParticulars(CheckingInClock inClock) {
		String string="%"+inClock.getCheckingInDate()+"%" ;
		inClock.setCheckingInDate(string);
		List<CheckingInClock> clockList = ckiClockDao.selectParticulars(inClock);
		return clockList;
	}

	//处理单个异常考勤新
	public String disposeOnlyAbnormal(long id,long tenantId,long staffId) {
		CheckingInClock inClock = new CheckingInClock();
		inClock.setId(id);
		inClock.setTenantid(tenantId);
		inClock.setStaffId(staffId);
		inClock.setAuditState("1");
		int i = ckiClockDao.updateByPrimaryKeySelective(inClock);
		if(i>0){
			return "处理成功请耐心等待审核";
		}
		return "处理失败请联系管理员";
	}

	//筛选
	public List<CheckingInClock> getSousuo(Long staffId ,Long tenantId, String stare, String end) {
		return ckiClockDao.getSousuo(tenantId,staffId,stare,end);
	}

	
	
	
}
