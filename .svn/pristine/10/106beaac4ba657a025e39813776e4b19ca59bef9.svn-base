package com.htyw.app.checkingIN.dao;

import com.htyw.app.checkingIN.pojo.CheckingInClock;
import com.htyw.app.checkingIN.pojo.CheckingInClockExample;
import java.util.List;

public interface CheckingInClockDao {
    int deleteByPrimaryKey(Long id);

    int insert(CheckingInClock record);

    int insertSelective(CheckingInClock record);

    List<CheckingInClock> selectByExample(CheckingInClockExample example);
    //考勤详情
    List<CheckingInClock> selectParticulars(CheckingInClock record);

    CheckingInClock selectByPrimaryKey(Long id);
    //根据员工id查询
    List<CheckingInClock> selectByStaffId(Long staffId ,Long tenantid );
    
    CheckingInClock selectByOlyn(Long staffId ,Long tenantid ,Long checkingInDateId );

    int updateByPrimaryKeySelective(CheckingInClock record);

    int updateByPrimaryKey(CheckingInClock record);
    
    int updateByStaffId(CheckingInClock record);

	List<CheckingInClock> checkNumber(long parseLong, long parseLong2, String date);

	List<CheckingInClock> getYichang(long parseLong);

	List<CheckingInClock> getSousuo(Long tenantId ,Long  staffId, String stare, String end);
}