package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.SchoolWeekWork;

public interface SchoolWeekWorkMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(SchoolWeekWork record);

    int insertSelective(SchoolWeekWork record);

    SchoolWeekWork selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(SchoolWeekWork record);

    int updateByPrimaryKey(SchoolWeekWork record);
}