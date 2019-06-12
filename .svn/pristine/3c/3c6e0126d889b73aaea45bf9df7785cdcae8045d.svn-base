package com.htyw.app.contact.controller;

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
import com.htyw.app.contact.pojo.CompanyClient;
import com.htyw.app.contact.pojo.Contact;
import com.htyw.app.contact.pojo.IndividualClient;
import com.htyw.app.contact.service.ContactService;
import com.htyw.app.utils.Page;

/*
 * 通讯录模块
 * 
 * 
 * */
// 告诉spring mvc这是个控制器
@RestController
@RequestMapping("contact")
public class ContactController {
	@Autowired
	private ContactService contactService;

	// 员工列表
	@RequestMapping("listStaff")
	public Map<String, Object> listStaff(Contact contact, Page page, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<Contact> listStaff = contactService.listStaff(contact);
			for (Contact contact2 : listStaff) {
				if ("".equals(contact2.getCustom3()) || contact2.getCustom3() == null) {
					contact2.setCustom3("暂无");
				}
				if ("".equals(contact2.getEmail()) || contact2.getEmail() == null) {
					contact2.setEmail("暂无");
				}
			}
			int total = (int) new PageInfo<>(listStaff).getTotal();
			page.caculateLast(total);
			result.put("listStaff", listStaff);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "302");
			result.put("message", "fail");
		}
		return result;
	}

	// 个人客户
	@RequestMapping("listClientP")
	public Map<String, Object> listClientP(Contact contact, Page page, IndividualClient individualClient,
			CompanyClient companyClient, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<IndividualClient> listClientP = contactService.listClientP(individualClient);
			for (IndividualClient individualClient2 : listClientP) {
				if ("".equals(individualClient2.getCONTACTNUMBER()) || individualClient2.getCONTACTNUMBER() == null) {
					individualClient2.setCONTACTNUMBER("暂无");
				}
				if ("".equals(individualClient2.getEmail()) || individualClient2.getEmail() == null) {
					individualClient2.setEmail("暂无");
				}
			}
			int total = (int) new PageInfo<>(listClientP).getTotal();
			page.caculateLast(total);
			result.put("listClientP", listClientP);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}

	// 公司客户
	@RequestMapping("listClientG")
	public Map<String, Object> listClientG(CompanyClient companyClient, Page page, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			PageHelper.offsetPage(page.getStart(), 10);
			List<CompanyClient> listClientG = contactService.listClientG(companyClient);
			for (CompanyClient companyClient2 : listClientG) {
				if ("".equals(companyClient2.getCompanyTelephone()) || companyClient2.getCompanyTelephone() == null) {
					companyClient2.setCompanyTelephone("暂无");
				}
				if ("".equals(companyClient2.getEmail()) || companyClient2.getEmail() == null) {
					companyClient2.setEmail("暂无");
				}
			}
			int total = (int) new PageInfo<>(listClientG).getTotal();
			page.caculateLast(total);
			result.put("listClientG", listClientG);
			result.put("code", "200");
			result.put("message", "success");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", "201");
			result.put("message", "fail");
		}
		return result;
	}

	// 公司和个人客户
	/*
	 * @RequestMapping("CompanyAndPersonage") public Map<String, Object>
	 * CompanyAndPersonage(CompanyAndPersonage cp) { Map<String, Object> result
	 * = new HashMap<String, Object>(); try { List<CompanyAndPersonage> cpList =
	 * contactService.CompanyAndPersonage(cp); result.put("CPList", cpList);
	 * result.put("code", "200"); result.put("message", "成功"); return result; }
	 * catch (Exception e) { e.printStackTrace(); result.put("code", "201");
	 * result.put("message", "系统走丢了请稍后重试"); return result; } }
	 */
}
