package com.htyw.app.banner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.banner.dao.BannerDao;
import com.htyw.app.banner.pojo.Banner;

@Service
public class BannerService {
	@Autowired
	private BannerDao bannerDao;

	public List<Banner> bannerInfo(Banner banner) {
		return bannerDao.bannerInfo(banner);
	}
	
	

}
