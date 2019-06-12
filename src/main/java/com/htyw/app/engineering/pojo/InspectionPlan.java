package com.htyw.app.engineering.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InspectionPlan {
	private String id;
	private String title;
	private String inspection;
	private double frequency;
	private double finishNumber;
	private double sum;
	private String inspectionPersonId;
	private String inspectionPerson;
	private Date inspectionStartTime;
	private Date inspectionEndTime;
	private String billStatus;
	private String effectStatus;
	private double process;// 巡检进度
	private String tenantId;
	List<DeviceInspectionE> DeviceInspectionE;
	List<DecorationReg> DecorationReg;
	List<PrgHouse> PrgHouse;
	List<InspectionMana> InspectionMana;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInspection() {
		return inspection;
	}

	public void setInspection(String inspection) {
		this.inspection = inspection;
	}

	public String getInspectionPersonId() {
		return inspectionPersonId;
	}

	public void setInspectionPersonId(String inspectionPersonId) {
		this.inspectionPersonId = inspectionPersonId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getInspectionStartTime() {
		return inspectionStartTime;
	}

	public void setInspectionStartTime(Date inspectionStartTime) {
		this.inspectionStartTime = inspectionStartTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getInspectionEndTime() {
		return inspectionEndTime;
	}

	public void setInspectionEndTime(Date inspectionEndTime) {
		this.inspectionEndTime = inspectionEndTime;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public double getFinishNumber() {
		return finishNumber;
	}

	public void setFinishNumber(double finishNumber) {
		this.finishNumber = finishNumber;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getProcess() {
		return process;
	}

	public void setProcess(double process) {
		this.process = process;
	}

	public String getInspectionPerson() {
		return inspectionPerson;
	}

	public void setInspectionPerson(String inspectionPerson) {
		this.inspectionPerson = inspectionPerson;
	}

	public String getEffectStatus() {
		return effectStatus;
	}

	public void setEffectStatus(String effectStatus) {
		this.effectStatus = effectStatus;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public List<DeviceInspectionE> getDeviceInspectionE() {
		return DeviceInspectionE;
	}

	public void setDeviceInspectionE(List<DeviceInspectionE> deviceInspectionE) {
		DeviceInspectionE = deviceInspectionE;
	}

	public List<DecorationReg> getDecorationReg() {
		return DecorationReg;
	}

	public void setDecorationReg(List<DecorationReg> decorationReg) {
		DecorationReg = decorationReg;
	}

	public List<PrgHouse> getPrgHouse() {
		return PrgHouse;
	}

	public void setPrgHouse(List<PrgHouse> prgHouse) {
		PrgHouse = prgHouse;
	}

	public List<InspectionMana> getInspectionMana() {
		return InspectionMana;
	}

	public void setInspectionMana(List<InspectionMana> inspectionMana) {
		InspectionMana = inspectionMana;
	}
}
