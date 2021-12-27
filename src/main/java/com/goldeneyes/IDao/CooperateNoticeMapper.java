package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.CooperateNotice;

public interface CooperateNoticeMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(CooperateNotice record);

    int insertSelective(CooperateNotice record);

    CooperateNotice selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(CooperateNotice record);

    int updateByPrimaryKey(CooperateNotice record);
}