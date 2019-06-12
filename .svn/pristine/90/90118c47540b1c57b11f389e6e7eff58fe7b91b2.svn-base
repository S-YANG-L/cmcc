package com.htyw.app.aboutAppointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.aboutAppointment.dao.AboutAppointmentDao;
import com.htyw.app.aboutAppointment.pojo.AboutAppointment;

@Service
public class AboutAppointmentService {

	@Autowired
	private AboutAppointmentDao aboutAppointmentDao;
	
	public List<AboutAppointment> list(AboutAppointment aboutAppointment) {
		return aboutAppointmentDao.list(aboutAppointment);
	}

	public String getPhoto(String apartmentPhoto) {
		return aboutAppointmentDao.getPhoto(apartmentPhoto);
	}

}
