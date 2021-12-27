package com.goldeneyes.IDao;

import com.goldeneyes.pojo.SchoolPic;

public interface SchoolPicMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(SchoolPic record);

    int insertSelective(SchoolPic record);

    SchoolPic selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(SchoolPic record);

    int updateByPrimaryKey(SchoolPic record);
    /**
     * 判断有无首页图片
     * @param schoolId
     * @return
     */
    int getSchoolPicCntBySchool(String schoolId);
    /**
     * 新增首页图片
     * @param record
     * @return
     */
    int addSchoolPic(SchoolPic record);
    /**
     * 修改首页图片
     * @param record
     * @return
     */
    int setSchoolPic(SchoolPic record);
    /**
     * 获取首页图片
     * @param schoolId
     * @return
     */
    SchoolPic getSchoolPic(String schoolId);
}