package com.htyw.app.houseLeasing.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.htyw.app.utils.LongJsonDeserializer;
import com.htyw.app.utils.LongJsonSerializer;

public class HouseLeasing {

	private Long id; // 主键
	private Long tenantId;  //租户主键
	private String houseRemark; // 房源备注
	private String apartmentPhoto; // 户型图片
	private String housePhotoVideo; // 房间图片或视频
	private Double tablePrice; // 表单价
	private String inJacketArea; // 套内面积
	private String houseName; // 房间名称
	private Long buildingId; // 楼栋主键
	private String buildingName; // 楼栋名称
	private String villageName; // 小区名称
	private Long villageId; // 小区主键
	private String communityName; // 社区名称
	private Long communityId; // 社区主键
	private Long apartmentId;  //户型主键
	private String apartmentName;  //户型名称
	private String roomComposition;  //房间构成
	private Double beginMoney; //开始金额
	private Double endMoney;  //结束金额
	private Date builtDate;   //建成日期
	private Double afforestedArea;  //绿化面积
	private int floorNumber;  //楼栋总楼层数
	private String elevator;  //是否有电梯
	private int coordinatePositionY;  //Y坐标位置（房间所在楼层）
	private String housingResources;//房屋全称
	private String sortType;//排序类型
	private String unitNumber;//房屋所在单元
	private String theFloorNumber;//房屋所在楼层
	
	
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTenantId() {
		return tenantId;
	}
	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}
	public String getHouseRemark() {
		return houseRemark;
	}
	public void setHouseRemark(String houseRemark) {
		this.houseRemark = houseRemark;
	}
	public String getApartmentPhoto() {
		return apartmentPhoto;
	}
	public void setApartmentPhoto(String apartmentPhoto) {
		this.apartmentPhoto = apartmentPhoto;
	}
	public String getHousePhotoVideo() {
		return housePhotoVideo;
	}
	public void setHousePhotoVideo(String housePhotoVideo) {
		this.housePhotoVideo = housePhotoVideo;
	}
	public Double getTablePrice() {
		return tablePrice;
	}
	public void setTablePrice(Double tablePrice) {
		this.tablePrice = tablePrice;
	}
	public String getInJacketArea() {
		return inJacketArea;
	}
	public void setInJacketArea(String inJacketArea) {
		this.inJacketArea = inJacketArea;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getVillageId() {
		return villageId;
	}
	public void setVillageId(Long villageId) {
		this.villageId = villageId;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getCommunityId() {
		return communityId;
	}
	public void setCommunityId(Long communityId) {
		this.communityId = communityId;
	}
	@JsonSerialize(using = LongJsonSerializer.class)
	@JsonDeserialize(using = LongJsonDeserializer.class)
	public Long getApartmentId() {
		return apartmentId;
	}
	public void setApartmentId(Long apartmentId) {
		this.apartmentId = apartmentId;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public String getRoomComposition() {
		return roomComposition;
	}
	public void setRoomComposition(String roomComposition) {
		this.roomComposition = roomComposition;
	}
	public Double getBeginMoney() {
		return beginMoney;
	}
	public void setBeginMoney(Double beginMoney) {
		this.beginMoney = beginMoney;
	}
	public Double getEndMoney() {
		return endMoney;
	}
	public void setEndMoney(Double endMoney) {
		this.endMoney = endMoney;
	}
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getBuiltDate() {
		return builtDate;
	}
	public void setBuiltDate(Date builtDate) {
		this.builtDate = builtDate;
	}
	public Double getAfforestedArea() {
		return afforestedArea;
	}
	public void setAfforestedArea(Double afforestedArea) {
		this.afforestedArea = afforestedArea;
	}
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public String getElevator() {
		return elevator;
	}
	public void setElevator(String elevator) {
		this.elevator = elevator;
	}
	public int getCoordinatePositionY() {
		return coordinatePositionY;
	}
	public void setCoordinatePositionY(int coordinatePositionY) {
		this.coordinatePositionY = coordinatePositionY;
	}
	public String getHousingResources() {
		return housingResources;
	}
	public void setHousingResources(String housingResources) {
		this.housingResources = housingResources;
	}
	public String getSortType() {
		return sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
	public String getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	public String getTheFloorNumber() {
		return theFloorNumber;
	}
	public void setTheFloorNumber(String theFloorNumber) {
		this.theFloorNumber = theFloorNumber;
	}	

}