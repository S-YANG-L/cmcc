package com.htyw.app.contract.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.contract.dao.ContractDao;
import com.htyw.app.contract.pojo.ContractList;

@Transactional
@Service
public class ContractService {
	@Autowired
	private ContractDao contractDao;

	public List<ContractList> listContract(ContractList contractList) {
		List<ContractList> lContractLists = contractDao.listContract(contractList);
		for (ContractList contractList2 : lContractLists) {
			if ("1".equals(contractList2.getContractType())) {
				contractList2.setContractType("房源合同");
			} else if ("2".equals(contractList2.getContractType())) {
				contractList2.setContractType("租赁物合同	");
			}
		}
		return lContractLists;
	}

}
