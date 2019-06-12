package com.htyw.app.lease.dao;

import java.util.List;

import com.htyw.app.lease.pojo.Lease;

public interface LeaseDao {

	List<Lease> listLease(Lease lease);

	void saveLease(Lease lease);
}