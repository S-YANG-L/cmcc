package com.htyw.app.customers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.customers.dao.CustomersDao;
import com.htyw.app.customers.pojo.Contract;
import com.htyw.app.customers.pojo.Customers;
import com.htyw.app.customers.pojo.RentLeaseBillC;
import com.htyw.app.customers.pojo.RentLeaseBillDtl;

@Transactional
@Service
public class CustomersService {

	@Autowired
	private CustomersDao customersDao;

	public List<Customers> listCustomers(Customers customers) {
		return customersDao.listCustomers(customers);
	}

	public List<Contract> listContract(Contract contract) {
		return customersDao.listContract(contract);
	}

	public List<RentLeaseBillC> listBill(RentLeaseBillC rentLeaseBill) {
		return customersDao.listBill(rentLeaseBill);
	}

	public RentLeaseBillC get(RentLeaseBillC rentLeaseBill) {
		return customersDao.get(rentLeaseBill);
	}

	public List<RentLeaseBillDtl> findBillId(RentLeaseBillDtl rLeaseBillDtl) {
		return customersDao.findBillId(rLeaseBillDtl);
	}

	public List<RentLeaseBillDtl> listBillDtl(RentLeaseBillDtl rentLeaseBillDtl) {
		return customersDao.listBillDtl(rentLeaseBillDtl);
	}

	public String getPhoto(String customerId) {
		// TODO Auto-generated method stub
		return customersDao.getPhoto(customerId);
	}

}
