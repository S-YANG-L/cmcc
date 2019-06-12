package com.htyw.app.propertyPayment.dao;

import java.util.List;

import com.htyw.app.propertyPayment.pojo.PropertyPayment;
import com.htyw.app.propertyPayment.pojo.PropertyPaymentDtl;

public interface PropertyPaymentDao {
	List<PropertyPayment> listPropertyPayment(PropertyPayment propertyPayment);

	List<PropertyPaymentDtl> listPropertyPaymentDtl(PropertyPaymentDtl propertyPaymentDtl);
}