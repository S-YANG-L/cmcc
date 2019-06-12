package com.htyw.app.houseLeasing.dao;

import com.htyw.app.houseLeasing.pojo.Repair;
import com.htyw.app.houseLeasing.pojo.RepairExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface RepairMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Repair repair);
    /**
     * 新增报修信息（根据传入对象自动添加）
     * @param record
     * @return
     */
    int insertSelective(Repair repair);

    /**
     * 获取投诉建议列表-分页查询
     * @param page:当前页码
     * @param size:展示条数
     * @return 工单信息列表
     */
    List<Map> getRepairList(String userName/*, int page, int size*/);
    
    /**
     * 获取完成信息列表-分页查询
     * @param page:当前页码
     * @param size:展示条数
     * @return 工单信息列表
     */
    List<Map> getRepairList1(@Param("userName")String userName, @Param("order")String order,@Param("dstart") Date dstart,@Param("dend") Date dend);
    
    /**
     * 获取未完成信息列表-分页查询
     * @param page:当前页码
     * @param size:展示条数
     * @return 工单信息列表
     */
    List<Map> getRepairList2(@Param("userName")String userName, @Param("order")String order,@Param("dstart") Date dstart,@Param("dend") Date dend);
    
    
    /**
     * 获取完成信息列表-分页查询
     * @param page:当前页码
     * @param size:展示条数
     * @return 工单信息列表
     */
    List<Map> getEvaluateList(String userName/*, int page, int size*/);
    
    
    /**
     * 根据ID获取报修详情
     * @param id:主键ID
     * @return 报修详情
     */
    Repair getRepairById(Long id);
    
    /**
     * 根据ID获取投诉建议详详情
     * @param id:主键ID
     * @return 投诉建议详详情
     */
    Repair getComplaintById(Long id);
    
    /**
     * 新增满意度、意见
     * @param id：主键ID
     * @param feedbackFraction：满意度  
     * @param feedbackCircumstances：意见
     * @return
     */
    int addView(Long id, String feedbackFraction, String feedbackCircumstances, String orderStatus);
    
    
    /**
     * 获取完成信息列表-分页查询
     * @param page:当前页码
     * @param size:展示条数
     * @return 工单信息列表
     */
    List<Repair> getCsList1(String userId, String page, String size);
    
    /**
     * 获取未完成信息列表-分页查询
     * @param page:当前页码
     * @param size:展示条数
     * @return 工单信息列表
     */
    List<Repair> getCsList2(String userId, String page, String size);
    
    /**
     * 获取房屋信息(合同管理表-出租记录表-房屋表)
     * @param example
     * @return
     */
    @Select("SELECT VILLAGE_NAME, BUILDING_NAME, HOUSE_NAME FROM base_house WHERE ID in (SELECT LEASEHOLD_ID FROM rent_lease_record WHERE CONTRACT_ID in (SELECT ID from rent_contract_management WHERE CUSTOMER_ID = #{0} AND LEASE_END_DATE > #{1}))")
    List<Map> getHouseName(Long id, String date);
    
    
    List<Repair> selectByExample(RepairExample example);

    Repair selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
}