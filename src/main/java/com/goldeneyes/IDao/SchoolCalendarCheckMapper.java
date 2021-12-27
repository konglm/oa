package com.goldeneyes.IDao;

import com.goldeneyes.pojo.SchoolCalendarCheck;

public interface SchoolCalendarCheckMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(SchoolCalendarCheck record);

    int insertSelective(SchoolCalendarCheck record);

    SchoolCalendarCheck selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(SchoolCalendarCheck record);

    int updateByPrimaryKey(SchoolCalendarCheck record);
    /**
     * 新增校历审核
     * @param record
     * @return
     */
    int addSchoolCalendarCheck(SchoolCalendarCheck record);
    /**
     * 审核校历
     * @param schoolCalendarId
     * @return
     */
    int setCalendarCheck(int schoolCalendarId); 
}