package com.htyw.app.engineeringPolling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.engineeringPolling.mapper.InspectionMapper;
import com.htyw.app.engineeringPolling.pojo.Inspection.BuildingInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.DecorateInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.DeviceInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.Inspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.InspectionReport;
import com.htyw.app.engineeringPolling.pojo.Inspection.KongguanInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.PublicReport;
import com.htyw.app.engineeringPolling.pojo.Inspection.RepairInspection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class InspectionService {
	@Autowired
	InspectionMapper inspectionMapper;

	public List<Inspection> listInspection(String tenantId, String inspectionPerson ,String state ,String dimState, String title) throws ParseException {
		ArrayList<Inspection> INList = new ArrayList<>();
		List<Inspection> listInspection = new ArrayList<>();
		String titleLike = "%"+title+"%";
		if ("0".equals(state)) {//未完成
			 listInspection = inspectionMapper.listInspection(Long.parseLong(tenantId),
					Long.parseLong(inspectionPerson));
			 if("0".equals(dimState)){//模糊查询未完成
				 listInspection = inspectionMapper.dimListInspection(Long.parseLong(tenantId),
							Long.parseLong(inspectionPerson),titleLike);
			 }
		}
		if ("1".equals(state)) {//已完成
			listInspection = inspectionMapper.inspectionEnd(Long.parseLong(tenantId),
					Long.parseLong(inspectionPerson));
			if("1".equals(dimState)){//模糊查询以完成
				listInspection = inspectionMapper.dimInspectionEnd(Long.parseLong(tenantId),
						Long.parseLong(inspectionPerson),titleLike);
			 }
		}
		if ("3".equals(state)) {//过期未完成
			List<Inspection> IList = new ArrayList<>();
			List<Inspection> REIList = new ArrayList<>();
			IList = inspectionMapper.listInspection(Long.parseLong(tenantId),Long.parseLong(inspectionPerson));
			if("3".equals(dimState)){//模糊查询以完成
			IList =inspectionMapper.dimListInspection(Long.parseLong(tenantId),Long.parseLong(inspectionPerson),titleLike);
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date NowTime = sdf.parse(GetNowDate());
			for (Inspection spection : IList) {// 判断是否过期
				Date EndTime = spection.getInspectionEndTime();
				if (EndTime.getTime() < NowTime.getTime()) {
					REIList.add(spection);
				}
			}
			return REIList;
			
		}else{
		// 获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date NowTime = sdf.parse(GetNowDate());
		for (Inspection spection : listInspection) {// 判断是否过期
			Date EndTime = spection.getInspectionEndTime();
			if (EndTime.getTime() > NowTime.getTime()) {
				INList.add(spection);
			}
		}
		return INList;
		}
	}

	public List<DeviceInspection> deviceInfo(DeviceInspection deviceInspection) {
		return inspectionMapper.deviceInfo(deviceInspection);
	}

	public List<DecorateInspection> decorateInfo(DecorateInspection decorateInspection) {
		return inspectionMapper.decorateInfo(decorateInspection);
	}

	public List<KongguanInspection> kongguanInfo(KongguanInspection kongguanInspection) {
		return inspectionMapper.kongguanInfo(kongguanInspection);
	}

	public List<BuildingInspection> buildingInfo(BuildingInspection buildingInspection) {
		return inspectionMapper.buildingInfo(buildingInspection);
	}

	public List<RepairInspection> repairInfo(RepairInspection repairInspection) {
		return inspectionMapper.repairInfo(repairInspection);
	}

	public void save(InspectionReport inspectionReport) {
		inspectionMapper.save(inspectionReport);
	}

	public void savePublic(PublicReport publicReport) {
		inspectionMapper.savePublic(publicReport);
	}

	// 获取详细时间
	public String GetNowDate() {
		String temp_str = "";
		Date dt = new Date();
		// 最后的aa表示“上午”或“下午” HH表示24小时制 如果换成hh表示12小时制 HH:mm:ss"
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		temp_str = sdf.format(dt);
		return temp_str;
	}

	// 查询单个计划
	public Inspection singleInspection(long parseLong) {
		Inspection inspection = inspectionMapper.singleInspection(parseLong);
		return inspection;
	}

	public String getContentAll(String id) {
		Inspection inspection = inspectionMapper.singleInspection(Long.parseLong(id));
		String reString = "";
		if (null != inspection) {
			// 设备巡检
			if ("0".equals(inspection.getInspection())) {
				List<String> list = inspectionMapper.getDevice(id);
				reString = transformStr(list);
			}
			// 装修
			if ("1".equals(inspection.getInspection())) {
				List<String> list = inspectionMapper.getDecoration(id);
				reString = transformStr(list);
			}
			// 空关
			if ("2".equals(inspection.getInspection())) {
				List<String> list = inspectionMapper.getKongGuan(id);
				reString = transformStr(list);
			}
			// 园区楼宇
			if ("3".equals(inspection.getInspection())) {
				List<String> list = inspectionMapper.getPremises(id);
				reString = transformStr(list);
			}
		}
		return reString;
	}

	public String transformStr(List<String> list) {
		String str = "";
		for (int i = 0; i < list.size(); i++) {
			if (i + 1 < list.size()) {
				str += list.get(i) + " , ";
			} else {
				str += list.get(i);
			}
		}
		System.out.println(str);
		return str;
	}

	public void changeState(String id) {
		inspectionMapper.changeState(Long.parseLong(id));
		
	}

}
