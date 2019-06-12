package com.htyw.app.houseLeasing.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.houseLeasing.dao.RepairMapper;
import com.htyw.app.houseLeasing.pojo.Repair;


@Service
public class RepairService {

	@Autowired
	private RepairMapper repairMapper;
	
	
	/**
	 * 新增报修信息
	 * @param repair 报修信息
	 * @return 1：成功  0：失败
	 */
	public int addRepair(Repair repair){
		return repairMapper.insertSelective(repair);
	}
	
	/**
	 * 获取投诉建议列表-分页查询
	 * @return 工单信息列表
	 */
	public List<Map> repairList(String userName/*, int page, int size*/){
		return repairMapper.getRepairList(userName/*, page, size*/);
	}
	
	/**
	 * 获取完成信息列表-分页查询
	 * @return 工单信息列表
	 */
	public List<Map> repairList1(String userName, String order, Date dstart, Date dend){
		return repairMapper.getRepairList1(userName, order, dstart, dend);
	}
	
	/**
	 * 获取未完成信息列表-分页查询
	 * @return 工单信息列表
	 */
	public List<Map> repairList2(String userName, String order, Date dstart, Date dend){
		return repairMapper.getRepairList2(userName, order, dstart, dend);
	}
	
	/**
	 * 获取完成信息列表-分页查询
	 * @return 工单信息列表
	 */
	public List<Map> getEvaluateList(String userName/*, int page, int size*/){
		return repairMapper.getEvaluateList(userName/*, page, size*/);
	}
	
	/**
	 * 通过ID查询报修详情信息
	 * @param id 主键ID
	 * @return 报修详情信息
	 */
	public Repair getRepairById(Long id){
		return repairMapper.getRepairById(id);
	}
	
	/**
	 * 通过ID查询投诉建议详情信息
	 * @param id 主键ID
	 * @return 投诉建议详情信息
	 */
	public Repair getComplaintById(Long id){
		return repairMapper.getComplaintById(id);
	}
	
	/**
     * 新增满意度、意见
     * @param id：主键ID
     * @param feedbackFraction：满意度  
     * @param feedbackCircumstances：意见
     * @return
     */
	public int addView(Long id, String userFraction, String userEvaluate, String orderStatus){
		return repairMapper.addView(id, userFraction, userEvaluate, orderStatus);
	}
	
	/**
	 * 获取投诉意见完成信息列表-分页查询
	 * @return 投诉意见列表
	 */
	public List<Repair> csList1(String userId, String page, String size){
		return repairMapper.getCsList1(userId, page, size);
	}
	
	/**
	 * 获取投诉意见未完成信息列表-分页查询
	 * @return 投诉意见列表
	 */
	public List<Repair> csList2(String userId, String page, String size){
		return repairMapper.getCsList2(userId, page, size);
	}
	
	/**
	 * 根据用户名获取房间号、小区名
	 * @param name：用户名
	 * @param date：当前时间
	 * @return
	 */
	public List<Map> getHouseName(Long id, String date){
		return repairMapper.getHouseName(id, date);
	}
}
