package com.htyw.app.billAndPay.dao;

import java.util.List;

import com.htyw.app.billAndPay.pojo.BillAndPay;
import com.htyw.app.billAndPay.pojo.BillAndPayDetail;

public interface BillAndPayDao {

	List<BillAndPay> list(BillAndPay billAndPay);

	List<BillAndPayDetail> listDtl(BillAndPayDetail billAndPayDetail);

	List<BillAndPayDetail> billListDtl(BillAndPayDetail billAndPayDetail);

}
