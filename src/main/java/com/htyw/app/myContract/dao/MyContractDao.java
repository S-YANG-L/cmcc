package com.htyw.app.myContract.dao;

import java.util.List;

import com.htyw.app.myContract.pojo.DocumentFiles;
import com.htyw.app.myContract.pojo.MyContract;

public interface MyContractDao {

	/*void save(MyContract myContract);
*/
	List<MyContract> list(MyContract myContract);

	String getPhoto(String apartmentPhoto);

	List<DocumentFiles> filesList(DocumentFiles documentFiles);



}