package com.htyw.app.order.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.insideInformation.dao.PrgInternalNotificationDao;
import com.htyw.app.insideInformation.pojo.PrgInternalNotification;
import com.htyw.app.order.dao.OrderBusinessDraftDao;
import com.htyw.app.order.pojo.OrderBusinessDraft;
import com.htyw.app.user.dao.RmUserDao;
import com.htyw.app.user.pojo.RmUser;
import com.htyw.app.utils.IDUtis;

@Service
@Transactional
public class OrderService {

	@Autowired
	private OrderBusinessDraftDao OBDDao;// 代办dao
	@Autowired
	private PrgInternalNotificationDao PINDao;// 消息dao
	@Autowired
	private RmUserDao userDao;// 员工dao

	// 获取代办事项
	public Map<String, Object> getBacklog(String singleId, String tenantId) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			ArrayList<OrderBusinessDraft> reList = new ArrayList<OrderBusinessDraft>();
			List<OrderBusinessDraft> orderList = OBDDao.selectBacklog(Long.parseLong(singleId),
					Long.parseLong(tenantId));
			if (orderList.size() == 0) {
				result.put("state", "当前无待办工单");
				return result;
			} else {
				for (OrderBusinessDraft orderBusinessDraft : orderList) {
					orderBusinessDraft.setIdString(String.valueOf(orderBusinessDraft.getId()));
					if(null==orderBusinessDraft.getRepairContent()){
						orderBusinessDraft.setRepairContent("");
					}
					/*if ("0".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("投诉.咨询类");
					}
					if ("1".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("报修类");
					}
					if ("2".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("预约类");
					}*/
					reList.add(orderBusinessDraft);
				}
			}
			result.put("order", reList);
			result.put("state", "200");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 模糊获取代办事项
	public Map<String, Object> obscure(String singleId, String tenantId, String orderContent,String state) {
		Map<String, Object> result = new HashMap<String, Object>();
		String orderContentLike = "%" + orderContent + "%";
		try {
			ArrayList<OrderBusinessDraft> reList = new ArrayList<OrderBusinessDraft>();
			List<OrderBusinessDraft> orderList = new ArrayList<OrderBusinessDraft>();
			if("0".equals(state)){//代办
				 orderList = OBDDao.obscure(Long.parseLong(singleId), Long.parseLong(tenantId),
						orderContentLike);
			}
			if("1".equals(state)){//已接单
				orderList = OBDDao.takeOrders(Long.parseLong(singleId), Long.parseLong(tenantId),
						orderContentLike);
			}
			if("2".equals(state)){//已完成
				orderList = OBDDao.endOrders(Long.parseLong(singleId), Long.parseLong(tenantId),
						orderContentLike);
			}
			if("3".equals(state)){//拒接
				orderList = OBDDao.refuseOrders(Long.parseLong(singleId), Long.parseLong(tenantId),
						orderContentLike);
			}
			
			if (orderList.size() == 0) {
				result.put("state", "当前暂无工单");
				return result;
			} else {
				for (OrderBusinessDraft orderBusinessDraft : orderList) {
					orderBusinessDraft.setIdString(String.valueOf(orderBusinessDraft.getId()));
					if(null==orderBusinessDraft.getRepairContent()){
						orderBusinessDraft.setRepairContent("");
					}
					/*if ("0".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("投诉.咨询类");
					}
					if ("1".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("报修类");
					}
					if ("2".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("预约类");
					}*/
					reList.add(orderBusinessDraft);
				}
			}
			result.put("order", reList);
			result.put("state", "200");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 转单
	public String redeploy(Long id) {
		String state = "操作失败";
		try {
			OrderBusinessDraft draft = new OrderBusinessDraft();
			draft.setId(id);
			draft.setOrderStatus("4");
			draft.setSinglePerson("");
			draft.setReceiveOrder("");
			int updateByPrimaryKey = OBDDao.updateByPrimaryKeySelective(draft);
			if (updateByPrimaryKey > 0) {
				state = "200";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return state;
	}

	// 接单
	public String takeOrders(Long id) {
		String state = "操作失败";
		try {
			OrderBusinessDraft draft = new OrderBusinessDraft();
			draft.setId(id);
			draft.setOrderStatus("1");
			draft.setReceiveOrder(GetNowYue());
			int updateByPrimaryKey = OBDDao.updateByPrimaryKeySelective(draft);
			if (updateByPrimaryKey > 0) {
				state = "200";
				OrderBusinessDraft order = OBDDao.selectByPrimaryKey(id);
				RmUser user = getUser(order.getSingleId());
				//写入消息表
				PrgInternalNotification PIN = new PrgInternalNotification();
				PIN.setTitle(order.getOrderContent());//主题
				PIN.setContent("您的("+order.getOrderContent()+")单据已经受理我们将于您预约的时间进行服务,请耐心等候"
						+ "联系电话"+user.getCustom3()+"姓名:"+user.getName()); //内容
				PIN.setPublisher(user.getName());//发布人
				PIN.setPublishDate(getDate(GetNowYue())); //发布时间
				PIN.setTenantid(String.valueOf(order.getTenantid())); //租户id
				PIN.setRmUserId(String.valueOf(order.getSingleId())); //关联用户表ID 用户id
				PIN.setType("1"); //
				PIN.setCustomer_name(order.getRealEstateCustomer()); //投诉人
				PIN.setCustomer_id(order.getRealEstateCustomerId()); //投诉人id
				PIN.setRoofPlacement("0");//是否置顶
				PIN.setState("0");//状态
				PIN.setId(Long.parseLong(IDUtis.getUUID()));
				PINDao.insertSelective(PIN);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return state;
	}

	// 获取已接单列表
	public Map<String, Object> getTakeOrders(String singleId, String tenantId) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			ArrayList<OrderBusinessDraft> reList = new ArrayList<OrderBusinessDraft>();
			List<OrderBusinessDraft> orderList = OBDDao.selectTakeOrders(Long.parseLong(singleId),
					Long.parseLong(tenantId));
			if (orderList.size() == 0) {
				result.put("state", "您当前还未接单");
				return result;
			} else {
				for (OrderBusinessDraft orderBusinessDraft : orderList) {
					orderBusinessDraft.setIdString(String.valueOf(orderBusinessDraft.getId()));
					if(null==orderBusinessDraft.getRepairContent()){
						orderBusinessDraft.setRepairContent("");
					}
					/*if ("0".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("投诉.咨询类");
					}
					if ("1".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("报修类");
					}
					if ("2".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("预约类");
					}*/
					reList.add(orderBusinessDraft);
				}
			}
			result.put("order", reList);
			result.put("state", "200");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 工单提交 OrderBusinessDraft orderBusinessDraft
	public String disposeAchieve(String id, String workFlow) {
		String state = "操作失败";
		try {
			OrderBusinessDraft orderBusinessDraft = new OrderBusinessDraft();
			orderBusinessDraft.setOrderStatus("3");// 单据状态
			orderBusinessDraft.setDisposeState("1");// 完成状态
			orderBusinessDraft.setId(Long.parseLong(id));// 主键
			orderBusinessDraft.setHandlingSituation(workFlow);// 工作流程,处理情况
			orderBusinessDraft.setAccomplishTime(GetNowYue());// 工单完成日期
			int updateByPrimaryKeySelective = OBDDao.updateByPrimaryKeySelective(orderBusinessDraft);
			if (updateByPrimaryKeySelective > 0) {
				state = "200";
				OrderBusinessDraft order = OBDDao.selectByPrimaryKey(Long.parseLong(id));
				RmUser user = getUser(order.getSingleId());
				//写入消息表
				PrgInternalNotification PIN = new PrgInternalNotification();
				PIN.setTitle(order.getOrderContent());//主题
				PIN.setContent("您的("+order.getOrderContent()+")单据已经完成,请稍后为我们的工作人员进行评价"); //内容
				PIN.setPublisher(user.getName());//发布人
				PIN.setPublishDate(getDate(GetNowYue())); //发布时间
				PIN.setTenantid(String.valueOf(order.getTenantid())); //租户id
				PIN.setRmUserId(String.valueOf(order.getSingleId())); //关联用户表ID 用户id
				PIN.setType("1"); //
				PIN.setCustomer_name(order.getRealEstateCustomer()); //投诉人
				PIN.setCustomer_id(order.getRealEstateCustomerId()); //投诉人id
				PIN.setId(Long.parseLong(IDUtis.getUUID()));//主键
				PIN.setRoofPlacement("0");//是否置顶
				PIN.setState("0");
				PINDao.insertSelective(PIN);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return state;
	}

	// 查询已完成 OrderBusinessDraft orderBusinessDraft
	public Map<String, Object> getAccomplish(String singleId, String tenantId) {
		Map<String, Object> result = new HashMap<String, Object>();
		ArrayList<OrderBusinessDraft> reList = new ArrayList<OrderBusinessDraft>();
		try {
			List<OrderBusinessDraft> orderList = OBDDao.selectAccomplish(Long.parseLong(singleId),
					Long.parseLong(tenantId));
			if (orderList.size() == 0) {
				result.put("state", "请耐心等待客户回访");
				return result;
			} else {
				for (OrderBusinessDraft orderBusinessDraft : orderList) {
					orderBusinessDraft.setIdString(String.valueOf(orderBusinessDraft.getId()));
					if(null==orderBusinessDraft.getRepairContent()){
						orderBusinessDraft.setRepairContent("");
					}
					/*if ("0".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("投诉.咨询类");
					}
					if ("1".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("报修类");
					}
					if ("2".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("预约类");
					}*/
					reList.add(orderBusinessDraft);
				}
			}
			result.put("order", reList);
			result.put("state", "200");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	public OrderBusinessDraft selectOrder(String id) {
		return OBDDao.selectByPrimaryKey(Long.parseLong(id));
	}

	// 获取已接单列表
	public Map<String, Object> haveFinished(String singleId, String tenantId) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			ArrayList<OrderBusinessDraft> reList = new ArrayList<OrderBusinessDraft>();
			List<OrderBusinessDraft> orderList = OBDDao.GetHaveFinished(Long.parseLong(singleId),
					Long.parseLong(tenantId));
			if (orderList.size() == 0) {
				result.put("state", "您当前还未接单");
				return result;
			} else {
				for (OrderBusinessDraft orderBusinessDraft : orderList) {
					orderBusinessDraft.setIdString(String.valueOf(orderBusinessDraft.getId()));
					if(null==orderBusinessDraft.getRepairContent()){
						orderBusinessDraft.setRepairContent("");
					}
					/*if ("0".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("投诉.咨询类");
					}
					if ("1".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("报修类");
					}
					if ("2".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("预约类");
					}*/
					reList.add(orderBusinessDraft);
				}
			}
			result.put("order", reList);
			result.put("state", "200");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}
	
	// 获取拒接单列表
	public Map<String, Object> getRefusing(String singleId, String tenantId) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			ArrayList<OrderBusinessDraft> reList = new ArrayList<OrderBusinessDraft>();
			List<OrderBusinessDraft> orderList = OBDDao.getRefusing(Long.parseLong(singleId),
					Long.parseLong(tenantId));
			if (orderList.size() == 0) {
				result.put("state", "您当前还未接单");
				return result;
			} else {
				for (OrderBusinessDraft orderBusinessDraft : orderList) {
					orderBusinessDraft.setIdString(String.valueOf(orderBusinessDraft.getId()));
					if(null==orderBusinessDraft.getRepairContent()){
						orderBusinessDraft.setRepairContent("");
					}
					/*if ("0".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("投诉.咨询类");
					}
					if ("1".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("报修类");
					}
					if ("2".equals(orderBusinessDraft.getOrderType())) {
						orderBusinessDraft.setOrderType("预约类");
					}*/
					reList.add(orderBusinessDraft);
				}
			}
			result.put("order", reList);
			result.put("state", "200");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "系统开小差请联系管理员");
			return result;
		}
	}

	// 获取详细月
	public String GetNowYue() {
		String temp_str = "";
		Date dt = new Date();
		// 最后的aa表示“上午”或“下午” HH表示24小时制 如果换成hh表示12小时制
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		temp_str = sdf.format(dt);
		return temp_str;
	}
	
	//获取用户
	public RmUser getUser(Long id){
		return userDao.selectByPrimaryKey(id);
	}
	
	// String 转为date
		public Date getDate(String str) throws ParseException {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			return format.parse(str);
		}

}
