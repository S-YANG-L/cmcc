package com.htyw.app.lease.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.lease.dao.LeaseDao;
import com.htyw.app.lease.pojo.Lease;

@Transactional
@Service
public class LeaseService {
	@Autowired
	private LeaseDao leaseDao;

	public List<Lease> listLease(Lease lease) {
		return leaseDao.listLease(lease);
	}

	public void saveLease(Lease lease) {
		leaseDao.saveLease(lease);

	}

}
