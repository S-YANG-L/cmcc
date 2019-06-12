package com.htyw.app.engineeringPolling.mapper;


import java.util.List;

import com.htyw.app.engineeringPolling.pojo.Inspection.BuildingInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.DecorateInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.DeviceInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.Inspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.InspectionReport;
import com.htyw.app.engineeringPolling.pojo.Inspection.KongguanInspection;
import com.htyw.app.engineeringPolling.pojo.Inspection.PublicReport;
import com.htyw.app.engineeringPolling.pojo.Inspection.RepairInspection;

public interface InspectionMapper {
	public int add(Inspection inspection);

	public void delete(int id);

	public Inspection get(int id);

	public int update(Inspection inspection);

	public List<Inspection> listInspection(Long tenantId  , Long inspectionPerson);
	
	public Inspection singleInspection(Long id);

	public List<DeviceInspection> deviceInfo(DeviceInspection deviceInspection);

	public List<DecorateInspection> decorateInfo(DecorateInspection decorateInspection);

	public List<KongguanInspection> kongguanInfo(KongguanInspection kongguanInspection);

	public List<BuildingInspection> buildingInfo(BuildingInspection buildingInspection);

	public List<RepairInspection> repairInfo(RepairInspection repairInspection);

	void save(InspectionReport inspectionReport);

	void savePublic(PublicReport publicReport);
	void updataFinishNumber(String effectStatus ,Long id);

	List<String> getDevice(String id);

	public List<String> getDecoration(String id);

	public List<String> getKongGuan(String id);

	public List<String> getPremises(String id);

	public void changeState(long parseLong);

	public List<Inspection> inspectionEnd(long parseLong, Long parseLong2);

	public List<Inspection> dimListInspection(long parseLong, long parseLong2, String titleLike);

	public List<Inspection> dimInspectionEnd(long parseLong, long parseLong2, String titleLike);


}