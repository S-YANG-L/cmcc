package com.htyw.app.propertyPayment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.propertyPayment.dao.PropertyPaymentDao;
import com.htyw.app.propertyPayment.pojo.PropertyPayment;
import com.htyw.app.propertyPayment.pojo.PropertyPaymentDtl;

@Service
@Transactional
public class PropertyPaymentService {
	
	@Autowired
	private PropertyPaymentDao paymentDao;//代办dao

	public List<PropertyPayment> listPropertyPayment(PropertyPayment propertyPayment) {
		return paymentDao.listPropertyPayment(propertyPayment);
	}

	public List<PropertyPaymentDtl> listPropertyPaymentDtl(PropertyPaymentDtl propertyPaymentDtl) {
		return paymentDao.listPropertyPaymentDtl(propertyPaymentDtl);
	}

	
	
		
































}
