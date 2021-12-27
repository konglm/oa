package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.SchoolCalendar;

public interface SchoolCalendarMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(SchoolCalendar record);

    int insertSelective(SchoolCalendar record);

    SchoolCalendar selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(SchoolCalendar record);

    int updateByPrimaryKey(SchoolCalendar record);
}