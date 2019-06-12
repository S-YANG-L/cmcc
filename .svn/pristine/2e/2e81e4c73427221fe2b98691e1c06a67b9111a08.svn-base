package com.htyw.app.engineering.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.engineering.dao.InspectionPlanDao;
import com.htyw.app.engineering.pojo.DecorationReg;
import com.htyw.app.engineering.pojo.DeviceInspectionE;
import com.htyw.app.engineering.pojo.DeviceTain;
import com.htyw.app.engineering.pojo.InspectionMana;
import com.htyw.app.engineering.pojo.InspectionPlan;
import com.htyw.app.engineering.pojo.InspectionReportE;
import com.htyw.app.engineering.pojo.PrgHouse;

@Transactional
@Service
public class InspectionPlanService {
	@Autowired
	private InspectionPlanDao inspectionPlanDao;

	public List<InspectionPlan> listInspectionPlan(InspectionPlan inspectionPlan) {
		return inspectionPlanDao.listInspectionPlan(inspectionPlan);
	}

	public List<DeviceInspectionE> listDeviceInspection(DeviceInspectionE deviceInspectionE) {
		return inspectionPlanDao.listDeviceInspection(deviceInspectionE);
	}

	public List<DecorationReg> listDecorationReg(DecorationReg decorationReg) {
		return inspectionPlanDao.listDecorationReg(decorationReg);
	}

	public List<PrgHouse> listPrgHouse(PrgHouse prgHouse) {
		return inspectionPlanDao.listPrgHouse(prgHouse);
	}

	public List<InspectionMana> listInspectionMana(InspectionMana inspectionMana) {
		return inspectionPlanDao.listInspectionMana(inspectionMana);
	}

	public List<DeviceTain> listDeviceTain(DeviceTain deviceTain) {
		return inspectionPlanDao.listDeviceTain(deviceTain);
	}

	public void saveInspectionPlan(InspectionPlan inspectionPlan) {
		inspectionPlanDao.saveInspectionPlan(inspectionPlan);

	}

	public List<InspectionPlan> listInspectionPlanRecord(InspectionPlan inspectionPlan) {
		List<InspectionPlan> inspectionPlans = inspectionPlanDao.listInspectionPlanRecord(inspectionPlan);
		for (InspectionPlan inspectionPlan2 : inspectionPlans) {

			if ("1".equals(inspectionPlan2.getEffectStatus())) {
				inspectionPlan2.setEffectStatus("已生效");
			} else if ("2".equals(inspectionPlan2.getEffectStatus())) {
				inspectionPlan2.setEffectStatus("已过期");
			} else if ("3".equals(inspectionPlan2.getEffectStatus())) {
				inspectionPlan2.setEffectStatus("已完成");
			}
		}
		return inspectionPlans;
	}

	public List<InspectionReportE> lInspectionReportEs(InspectionReportE inspectionReportE) {
		return inspectionPlanDao.listReport(inspectionReportE);
	}

}
