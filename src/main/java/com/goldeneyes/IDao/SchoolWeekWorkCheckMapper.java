package com.goldeneyes.IDao;

import com.goldeneyes.pojo.SchoolWeekWorkCheck;

public interface SchoolWeekWorkCheckMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(SchoolWeekWorkCheck record);

    int insertSelective(SchoolWeekWorkCheck record);

    SchoolWeekWorkCheck selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(SchoolWeekWorkCheck record);

    int updateByPrimaryKey(SchoolWeekWorkCheck record);
    /**
     * 新增周程审核
     * @param record
     * @return
     */
    int addSchoolWeekWorkCheck(SchoolWeekWorkCheck record);
    /**
     * 审核周程通过
     * @param schoolWeekWorkId
     * @return
     */
    int setWeekWorkCheck(int schoolWeekWorkId);
}