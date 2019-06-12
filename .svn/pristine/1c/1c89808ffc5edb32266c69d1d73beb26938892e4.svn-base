package com.htyw.app.myContract.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.htyw.app.myContract.pojo.DocumentFiles;
import com.htyw.app.myContract.pojo.MyContract;
import com.htyw.app.myContract.service.MyContractService;
import com.htyw.app.utils.Page;

@RestController
@RequestMapping("myContractController")
public class MyContractController {

	@Autowired
	private MyContractService myContractService;
	
	/**
	 * @param myContract
	 * @author liushihao
	 * 合同记录保存
	 */
/*	@RequestMapping(value = "save")	
	public Map<String, Object> save(@RequestBody MyContract myContract)
		throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			myContractService.save(myContract);
			result.put("code", 200);
			result.put("message", "success!");	
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed");
		}
		return result;
	}*/
	
	/**
	 * @param myContract
	 * @author lshao
	 * 查询合同记录，列表展示
	 */
	@RequestMapping(value = "list")	
	public Map<String, Object> list(MyContract myContract, Page page, HttpServletRequest request, HttpServletResponse response){
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			PageHelper.offsetPage(page.getStart(),10);
			List<MyContract> listMyContract = myContractService.listMyContract(myContract);
			for (MyContract myContract2 : listMyContract) {
				DocumentFiles documentFiles = new DocumentFiles();
				documentFiles.setBatchNo(myContract2.getContractEnclosure());
				List<DocumentFiles> filesList = myContractService.filesList(documentFiles);
				myContract2.setDocumentFiles(filesList);
				String photo = myContractService.getPhoto(myContract2.getApartmentPhoto());
				myContract2.setImgUrl(photo);
			}
			int total = (int) new PageInfo<>(listMyContract).getTotal();
	         
			page.caculateLast(total);
			result.put("listMyContract", listMyContract);
			result.put("code", 200);
			result.put("message", "success!");	
		}catch(Exception e){
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed");
		}
		return result;
	}
}
