package com.htyw.app.engineeringPolling.mapper;

import java.util.List;

import com.htyw.app.engineeringPolling.pojo.CopyForm.PrgCopyForm;

public interface PrgCopyFormDao {
    int deleteByPrimaryKey(Long id);

    int insert(PrgCopyForm record);

    int insertSelective(PrgCopyForm record);

    PrgCopyForm selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PrgCopyForm record);

    int updateByPrimaryKey(PrgCopyForm record);

	List<PrgCopyForm> getMeterredhistory(String copy_name_id);

	List<PrgCopyForm> getMeterredhistoryLike(String copy_name_id, String stare, String end);
}