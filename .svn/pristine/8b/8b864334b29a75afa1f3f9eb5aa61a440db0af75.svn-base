package com.htyw.app.billAndPay.controller;

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
import com.htyw.app.billAndPay.pojo.BillAndPay;
import com.htyw.app.billAndPay.pojo.BillAndPayDetail;
import com.htyw.app.billAndPay.service.BillAndPayService;
import com.htyw.app.utils.Page;

@RestController
@RequestMapping("billAndPayController")
public class BillAndPayController {

	@Autowired
	private BillAndPayService billAndPayService;
	
	/**
	 * 
	 * @param billAndPay
	 * @author lshao
	 * 账单查询，列表展示（主子表查询）
	 */
	@RequestMapping(value = "list")
	public Map<String, Object>list(BillAndPay billAndPay, Page page, HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			PageHelper.offsetPage(page.getStart(),10);
			List<BillAndPay> list = billAndPayService.list(billAndPay);
			for(BillAndPay listDetail : list){
				BillAndPayDetail billAndPayDetail = new BillAndPayDetail();
				billAndPayDetail.setBillId(listDetail.getId());
				List<BillAndPayDetail> listDtl = billAndPayService.listDtl(billAndPayDetail);
				listDetail.setBillAndPayDetail(listDtl);
			}
			int total = (int) new PageInfo<>(list).getTotal();
	         
			page.caculateLast(total);
			result.put("list", list);
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
	 * @param billAndPay
	 * @author lshao
	 * 账单查询，列表展示（子表查询）
	 */
	@RequestMapping(value = "listDtl")
	public Map<String, Object>listDtl(BillAndPayDetail billAndPayDetail,HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		Map<String,Object> result = new HashMap<String,Object>();
		try{
			List<BillAndPayDetail> billListDtl =  billAndPayService.billListDtl(billAndPayDetail);
			result.put("billListDtl", billListDtl);
			result.put("code", 200);
			result.put("message", "success!");	
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed");
		}
		return result;
	}

}
