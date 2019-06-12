package com.htyw.app.houseLeasing.dao;

import java.util.List;

import com.htyw.app.houseLeasing.pojo.HouseLeasing;

public interface HouseBaseInfoDao {

	List<HouseLeasing> sheQuList(Long tenantId);

	List<HouseLeasing> xiaoQuList(Long communityId);

	List<HouseLeasing> louDongList(Long villageId);

	List<HouseLeasing> leiXingList(Long buildingId);

}
