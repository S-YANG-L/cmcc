package com.htyw.app.customers.dao;

import java.util.List;

import com.htyw.app.customers.pojo.Contract;
import com.htyw.app.customers.pojo.Customers;
import com.htyw.app.customers.pojo.RentLeaseBillC;
import com.htyw.app.customers.pojo.RentLeaseBillDtl;

public interface CustomersDao {

	List<Customers> listCustomers(Customers customers);

	List<Contract> listContract(Contract contract);

	List<RentLeaseBillC> listBill(RentLeaseBillC rentLeaseBill);

	RentLeaseBillC get(RentLeaseBillC rentLeaseBill);

	List<RentLeaseBillDtl> findBillId(RentLeaseBillDtl rLeaseBillDtl);

	List<RentLeaseBillDtl> listBillDtl(RentLeaseBillDtl rentLeaseBillDtl);

	String getPhoto(String customerId);

}