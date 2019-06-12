package com.htyw.app.house.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.house.dao.HouseDao;
import com.htyw.app.house.pojo.Building;
import com.htyw.app.house.pojo.Community;
import com.htyw.app.house.pojo.House;
import com.htyw.app.house.pojo.RentPeople;
import com.htyw.app.house.pojo.Village;

@Transactional
@Service
public class HouseService {
	@Autowired
	private HouseDao houseDao;

	public List<Community> communityList(Community community) {
		return houseDao.communityList(community);
	}

	public List<Village> villageList(Village village) {
		return houseDao.villageList(village);
	}

	public List<Building> buildingList(Building building) {
		return houseDao.buildingList(building);
	}

	public List<House> houseList(House house) {
		return houseDao.houseList(house);
	}

	public List<RentPeople> rentpeople(RentPeople rentPeople) {
		return houseDao.rentpeople(rentPeople);
	}

	public List<House> unitList(House house) {
		return houseDao.unitList(house);
	}

	public String getPhoto(String apartmentPhoto) {
		return houseDao.getPhoto(apartmentPhoto);
	}

}
