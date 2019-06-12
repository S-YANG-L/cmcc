package com.htyw.app.myCollection.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.myCollection.pojo.MyCollection;
import com.htyw.app.myCollection.service.MyCollectionService;
import com.htyw.app.utils.Page;

@RestController
@RequestMapping("myCollectionController")
public class MyCollectionController {
	
	@Autowired
	private MyCollectionService myCollectionService;
	
	/**
	 * 
	 * @param myCollection
	 * @author liushihao
	 * 收藏，保存我的房屋收藏
	 */
	@RequestMapping(value = "saveMyCollection")
	public Map<String, Object> saveMyCollection(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		Long houseId = Long.valueOf(request.getParameter("houseId")).longValue();
		String houseName = request.getParameter("houseName");
		Long collectorId = Long.valueOf(request.getParameter("collectorId")).longValue();	
		String collectorName = request.getParameter("collectorName");
		Long communityId = Long.valueOf(request.getParameter("communityId")).longValue();	
		String communityName = request.getParameter("communityName");
		Long villageId = Long.valueOf(request.getParameter("villageId")).longValue();	
		String villageName = request.getParameter("villageName");
		Long buildingId = Long.valueOf(request.getParameter("buildingId")).longValue();	
		String buildingName = request.getParameter("buildingName");
		Long apartmentId = Long.valueOf(request.getParameter("apartmentId")).longValue();	
		String apartmentName = request.getParameter("apartmentName");
		String houseRemark = request.getParameter("houseRemark");
		Double inJacketArea = Double.parseDouble(request.getParameter("inJacketArea"));
		Double tablePrice = Double.parseDouble(request.getParameter("tablePrice"));
		MyCollection myCollection = new MyCollection();
		myCollection.setHouseId(houseId);
		myCollection.setHouseName(houseName);
		myCollection.setCollectorId(collectorId);
		myCollection.setCollectorName(collectorName);		
		myCollection.setCommunityId(communityId);
		myCollection.setCommunityName(communityName);
		myCollection.setVillageId(villageId);
		myCollection.setVillageName(villageName);
		myCollection.setBuildingId(buildingId);
		myCollection.setBuildingName(buildingName);
		myCollection.setHouseRemark(houseRemark);
		myCollection.setApartmentId(apartmentId);
		myCollection.setApartmentName(apartmentName);
		myCollection.setInJacketArea(inJacketArea);
		myCollection.setTablePrice(tablePrice);
		try{
			myCollectionService.saveMyCollection(myCollection);
			result.put("code", 200);
			result.put("message", "success!");			
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed");			
		}
		return result;
	}
	
	/**
	 * 
	 * @param myCollection
	 * @author liushihao
	 * 查询我的房屋收藏内容
	 */
	@RequestMapping(value = "listMyCollection")
	public Map<String, Object> listMyCollection(MyCollection myCollection, Page page, HttpServletRequest request, HttpServletResponse response)
			throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			PageHelper.offsetPage(page.getStart(),10);
			List<MyCollection> collectionList = myCollectionService.collectionList(myCollection);
			for (MyCollection myCollection2 : collectionList) {
				String photo = myCollectionService.getPhoto(myCollection2.getApartmentPhoto());
				myCollection2.setImgUrl(photo);
			}
			int total = (int) new PageInfo<>(collectionList).getTotal();
	         
			page.caculateLast(total);
			result.put("collectionList", collectionList);
			result.put("code", 200);
			result.put("message", "success!");
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;
	}
	/**
	 * 取消房屋收藏
	 */
	@RequestMapping(value = "noCollect", method = RequestMethod.POST)
	public Map<String, Object> noCollect(HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		String cId = request.getParameter("cId");
		Long id = Long.parseLong(cId);
		String collectionStatus = request.getParameter("collectionStatus");
		try {
			
			int i = myCollectionService.updateInfo(id, collectionStatus);
			if(i == 1){
				result.put("code", "200");
				result.put("message", "success");
			}else{
				result.put("code", "202");
				result.put("message", "暂无数据");
			}
		} catch (Exception e) {
			result.put("code", "201");
			result.put("message", "failed");
			e.printStackTrace();
		}
		return result;
	}

}
