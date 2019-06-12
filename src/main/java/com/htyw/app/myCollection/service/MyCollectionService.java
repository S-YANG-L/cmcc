package com.htyw.app.myCollection.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htyw.app.myCollection.dao.MyCollectionDao;
import com.htyw.app.myCollection.pojo.MyCollection;

@Service
public class MyCollectionService {

	@Autowired
	private MyCollectionDao myCollectionDao;

	public void saveMyCollection(MyCollection myCollection) {
		myCollection.setId(new Date().getTime());
		myCollectionDao.save(myCollection);		
	}

	public List<MyCollection> collectionList(MyCollection myCollection) {
		return myCollectionDao.collectionList(myCollection);
	}

	public String getPhoto(String apartmentPhoto) {
		return myCollectionDao.getPhoto(apartmentPhoto);
	}

	public int updateInfo(Long id, String collectionStatus) {
		return myCollectionDao.updateInfo(id,collectionStatus);
	}

}
