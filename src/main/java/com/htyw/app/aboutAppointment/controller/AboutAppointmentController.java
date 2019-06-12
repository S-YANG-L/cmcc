package com.htyw.app.aboutAppointment.controller;

import java.util.ArrayList;
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
import com.htyw.app.aboutAppointment.pojo.AboutAppointment;
import com.htyw.app.aboutAppointment.service.AboutAppointmentService;
import com.htyw.app.utils.Page;

@RestController
@RequestMapping("aboutAppointmentController")
public class AboutAppointmentController {

	@Autowired
	private AboutAppointmentService aboutAppointmentService;
	
	

	/**
	 * 
	 * @param billAndPay
	 * @author lshao
	 * 约看查询
	 */
	@RequestMapping(value = "list")
	public Map<String, Object>list(AboutAppointment aboutAppointment, Page page, HttpServletRequest request,HttpServletResponse response)
			throws Exception{
		Map<String,Object> result = new HashMap<String,Object>();
		try{
			PageHelper.offsetPage(page.getStart(),10);
			List<AboutAppointment> list =  aboutAppointmentService.list(aboutAppointment);
			for (AboutAppointment aboutAppointment2 : list) {
					String photo = aboutAppointmentService.getPhoto(aboutAppointment2.getApartmentPhoto());
					aboutAppointment2.setImgUrl(photo);
			}
			int total = (int) new PageInfo<>(list).getTotal();
			page.caculateLast(total);
			result.put("list", list);
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
