package com.htyw.app.billAndPay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.billAndPay.dao.BillAndPayDao;
import com.htyw.app.billAndPay.pojo.BillAndPay;
import com.htyw.app.billAndPay.pojo.BillAndPayDetail;

@Service
public class BillAndPayService {

	@Autowired
	private BillAndPayDao billAndPayDao;
	/**
	 * 
	 * @param billAndPay
	 * @author lshao
	 * 主子表主表查询
	 */
	public List<BillAndPay> list(BillAndPay billAndPay) {	
		return billAndPayDao.list(billAndPay);
	}
	/**
	 * 
	 * @param billAndPayDetail
	 * @author lshao
	 * 主子表子表查询
	 */
	public List<BillAndPayDetail> listDtl(BillAndPayDetail billAndPayDetail) {
		return billAndPayDao.listDtl(billAndPayDetail);
	}
	/**
	 * 
	 * @param billAndPay
	 * @author lshao
	 * 单查字表
	 */
	public List<BillAndPayDetail> billListDtl(BillAndPayDetail billAndPayDetail) {
		return billAndPayDao.billListDtl(billAndPayDetail);
	}

}
