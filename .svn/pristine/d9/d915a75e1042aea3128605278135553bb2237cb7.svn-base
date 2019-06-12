package com.htyw.app.contract.controller;

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
import com.htyw.app.contract.pojo.ContractList;
import com.htyw.app.contract.service.ContractService;
import com.htyw.app.myContract.pojo.DocumentFiles;
import com.htyw.app.myContract.service.MyContractService;
import com.htyw.app.utils.Page;

/*
 * 租赁管理模块
 * 
 * 
 * */
// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("contract")
public class ContractController {
	@Autowired
	private ContractService contractService;
	@Autowired
	private MyContractService myContractService;

	// 房源信息列表接口
	@RequestMapping("listContract")
	public Map<String, Object> listContract(ContractList contractList, Page page, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<ContractList> listContract = contractService.listContract(contractList);
			for (ContractList contractList2 : listContract) {
				DocumentFiles documentFiles = new DocumentFiles();
				documentFiles.setBatchNo(contractList2.getContractEnclosure());
				List<DocumentFiles> filesList = myContractService.filesList(documentFiles);
				contractList2.setDocumentFiles(filesList);
			}
			int total = (int) new PageInfo<>(listContract).getTotal();
			page.caculateLast(total);
			result.put("listContract", listContract);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

}
