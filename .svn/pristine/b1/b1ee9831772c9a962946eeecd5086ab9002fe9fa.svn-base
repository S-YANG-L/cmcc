package com.htyw.app.appointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.appointment.dao.AppointmentDao;
import com.htyw.app.appointment.pojo.Appointment;

@Transactional
@Service
public class AppointmentService {
	@Autowired
	private AppointmentDao appointmentDao;

	public List<Appointment> listAppointment(Appointment appointment) {
		return appointmentDao.listAppointment(appointment);
	}

	public void agree(Appointment appointment) {
		appointmentDao.agree(appointment);

	}

	public List<Appointment> listAppointmentRec(Appointment appointment) {
		return appointmentDao.listAppointmentRec(appointment);
	}

	public void refuse(Appointment appointment) {
		appointmentDao.refuse(appointment);
	}

	public void save(Appointment appointment) {
		appointmentDao.save(appointment);
	}

}
