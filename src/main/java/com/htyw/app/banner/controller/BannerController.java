package com.htyw.app.banner.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htyw.app.banner.pojo.Banner;
import com.htyw.app.banner.service.BannerService;

@RestController
@RequestMapping("banner")
public class BannerController {
	@Autowired
	private BannerService bannerService;
	
	@RequestMapping(value = "bannerInfo")
	public Map<String, Object> bannerInfo(Banner banner, HttpServletRequest request, HttpServletResponse response){
		Map<String,Object> result = new HashMap<String, Object>();
		try {
			List<Banner> bannerInfo = bannerService.bannerInfo(banner);
			result.put("bannerInfo", bannerInfo);
			result.put("code", 200);
			result.put("message", "success!");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 201);
			result.put("message", "failed!");
		}
		return result;
		
		
	}
	
}
