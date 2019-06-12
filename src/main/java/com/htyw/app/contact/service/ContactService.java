package com.htyw.app.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htyw.app.contact.dao.ContactDao;
import com.htyw.app.contact.pojo.CompanyClient;
import com.htyw.app.contact.pojo.Contact;
import com.htyw.app.contact.pojo.IndividualClient;

@Transactional
@Service
public class ContactService {
	@Autowired
	private ContactDao contactDao;

	public List<Contact> listStaff(Contact contact) {
		return contactDao.listStaff(contact);
	}

	//公司
	public List<CompanyClient> listClientG(CompanyClient companyClient) {
		return contactDao.listClientG(companyClient);
	}

	//个人
	public List<IndividualClient> listClientP(IndividualClient individualClient) {
		return contactDao.listClientP(individualClient);
	}

	//公司和个人客户
	/*public List<CompanyAndPersonage> CompanyAndPersonage(CompanyAndPersonage cp) {
		CompanyClient companyClient = new CompanyClient();//公司
		IndividualClient individualClient = new IndividualClient();//个人
		if(null!=cp.getCtenantId()){//公司
			companyClient.setTenantId(cp.getCtenantId());
		}
		if(null!=cp.getCcompanyName()){//公司名称
			companyClient.setCUSTOMERNAME(cp.getCcompanyName());
		}
		
		if(null!=cp.getPtenantId()){//个人
			individualClient.setTenantId(cp.getPtenantId());
		}
		if(null!=cp.getPcustomerName()){//个人名称
			individualClient.setCUSTOMERNAME(cp.getPcustomerName());
		}
		
		 ArrayList<CompanyAndPersonage> CPList = new ArrayList<CompanyAndPersonage>();
		 List<CompanyClient> CList = contactDao.listClientG(companyClient);
		for (CompanyClient C : CList) {
			CompanyAndPersonage Cc = new CompanyAndPersonage();
			Cc.setCid(C.getId());
			Cc.setCcompanyName(C.getCUSTOMERNAME());
			Cc.setCcompanyTelephone(C.getCONTACTNUMBER());
			Cc.setCemail(C.getEmail());
			Cc.setCbusinessAddress(C.getCONTACTADDRESS());
			Cc.setCtenantId(companyClient.getTenantId());
			CPList.add(Cc);
		}
		
		List<IndividualClient> PList = contactDao.listClientP(individualClient);
		for (IndividualClient P : PList) {
			CompanyAndPersonage Pp = new CompanyAndPersonage();
			Pp.setPid(P.getId());
			Pp.setPcustomerName(P.getCUSTOMERNAME());
			Pp.setPcontactNumber(P.getCONTACTNUMBER());
			Pp.setPcontactAddress(P.getCONTACTADDRESS());
			Pp.setPtenantId(P.getTenantId());
			Pp.setPemail(P.getEmail());
			CPList.add(Pp);
		}
		
		return CPList;
	}
*/
}
