package com.htyw.app.contact.dao;

import java.util.List;

import com.htyw.app.contact.pojo.CompanyClient;
import com.htyw.app.contact.pojo.Contact;
import com.htyw.app.contact.pojo.IndividualClient;

public interface ContactDao {

	public List<Contact> listStaff(Contact contact);

	public List<CompanyClient> listClientG(CompanyClient companyClient);

	public List<IndividualClient> listClientP(IndividualClient individualClient);

}