package com.htyw.app.house.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.house.pojo.Building;
import com.htyw.app.house.pojo.Community;
import com.htyw.app.house.pojo.House;
import com.htyw.app.house.pojo.RentPeople;
import com.htyw.app.house.pojo.Village;
import com.htyw.app.house.service.HouseService;
import com.htyw.app.utils.Page;

/*
 * 工程管理模块
 * 
 * */
// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("house")
public class HouseController {
	@Autowired
	private HouseService houseService;

	// 获得所有社区
	@RequestMapping("communityList")
	public Map<String, Object> communityList(Community community, HttpServletRequest request,
			HttpServletResponse response) {
		HashMap<String, Object> reMap = new HashMap<String, Object>();
		try {
			List<Community> communityList = houseService.communityList(community);
			reMap.put("communityList", communityList);
			reMap.put("code", "200");
			return reMap;
		} catch (Exception e) {
			e.printStackTrace();
			reMap.put("massage", "系统开小差了请稍后重试");
			return reMap;
		}
	}

	// 获得所有小区
	@RequestMapping("villageList")
	public Map<String, Object> villageList(Village village, HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, Object> reMap = new HashMap<String, Object>();
		try {
			List<Village> villageList = houseService.villageList(village);
			reMap.put("villageList", villageList);
			reMap.put("code", "200");
			return reMap;
		} catch (Exception e) {
			e.printStackTrace();
			reMap.put("massage", "系统开小差了请稍后重试");
			return reMap;
		}
	}

	// 获得所有楼栋
	@RequestMapping("buildingList")
	public Map<String, Object> buildingList(Building building, HttpServletRequest request,
			HttpServletResponse response) {
		HashMap<String, Object> reMap = new HashMap<String, Object>();
		try {
			List<Building> buildingList = houseService.buildingList(building);
			reMap.put("buildingList", buildingList);
			reMap.put("code", "200");
			return reMap;
		} catch (Exception e) {
			e.printStackTrace();
			reMap.put("massage", "系统开小差了请稍后重试");
			return reMap;
		}
	}

	// 获得所有楼栋
	@RequestMapping("unitList")
	public Map<String, Object> unitList(House house, HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, Object> reMap = new HashMap<String, Object>();
		try {
			List<House> unitList = houseService.unitList(house);
			reMap.put("unitList", unitList);
			reMap.put("code", "200");
			return reMap;
		} catch (Exception e) {
			e.printStackTrace();
			reMap.put("massage", "系统开小差了请稍后重试");
			return reMap;
		}
	}

	// 获得所有房屋
	@RequestMapping("houseList")
	public Map<String, Object> houseList(House house, Page page, HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, Object> reMap = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<House> houseList = houseService.houseList(house);
			for (House house2 : houseList) {
				String photo = houseService.getPhoto(house2.getApartmentPhoto());
				if("".equals(photo)||photo==null){
					house2.setHousePhotoVideo(null);
				}else{
					house2.setHousePhotoVideo(photo);
				}
				house2.setHouseNameAll(house2.getCommunityName() + house2.getVillageName() + house2.getBuildingName()
						+ house2.getUnitNumber());
				if ("0".equals(house2.getRoomStatus())) {
					house2.setRoomStatus("不可租");
				} else if ("1".equals(house2.getRoomStatus())) {
					house2.setRoomStatus("一级租控");
				} else if ("2".equals(house2.getRoomStatus())) {
					house2.setRoomStatus("二级租控");
				} else if ("3".equals(house2.getRoomStatus())) {
					house2.setRoomStatus("已租");
				} else if ("4".equals(house2.getRoomStatus())) {
					house2.setRoomStatus("锁定");
				}
			}
			int total = (int) new PageInfo<>(houseList).getTotal();
			page.caculateLast(total);
			reMap.put("houseList", houseList);
			reMap.put("code", "200");
			return reMap;
		} catch (Exception e) {
			e.printStackTrace();
			reMap.put("massage", "系统开小差了请稍后重试");
			return reMap;
		}
	}

	// 获得房屋租客信息
	@RequestMapping("rPeople")
	public Map<String, Object> rentPeople(RentPeople rentPeople, HttpServletRequest request,
			HttpServletResponse response) {
		HashMap<String, Object> reMap = new HashMap<String, Object>();
		try {
			List<RentPeople> rentPeoples2 = houseService.rentpeople(rentPeople);
			List<RentPeople> rentPeoples = new ArrayList<>();
			Long time = new Date().getTime();
			for (RentPeople rentPeople2 : rentPeoples2) {
				Long time2 = rentPeople2.getLeaseEndDate().getTime();
				if (time2.longValue() > time.longValue()) {
					rentPeoples.add(rentPeople2);
				}
			}
			reMap.put("rentPeoples", rentPeoples);
			reMap.put("code", "200");
			return reMap;
		} catch (Exception e) {
			e.printStackTrace();
			reMap.put("massage", "系统开小差了请稍后重试");
			return reMap;
		}
	}

	// 获得房屋租客记录
	@RequestMapping("rPeopleRec")
	public Map<String, Object> rPeopleRec(RentPeople rentPeople, HttpServletRequest request,
			HttpServletResponse response) {
		HashMap<String, Object> reMap = new HashMap<String, Object>();
		try {
			List<RentPeople> rPeopleRec = houseService.rentpeople(rentPeople);
			Long time = new Date().getTime();
			for (RentPeople rentPeople3 : rPeopleRec) {
				Long time2 = rentPeople3.getLeaseEndDate().getTime();
				if (time2.longValue() > time.longValue()) {
					rentPeople3.setRentStatus("在租");
				} else {
					rentPeople3.setRentStatus("退租");
				}
			}

			reMap.put("rPeopleRec", rPeopleRec);
			reMap.put("code", "200");
			return reMap;
		} catch (Exception e) {
			e.printStackTrace();
			reMap.put("massage", "系统开小差了请稍后重试");
			return reMap;
		}
	}

}
