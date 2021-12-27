package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.SchoolPeriod;

public interface SchoolPeriodMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(SchoolPeriod record);

    int insertSelective(SchoolPeriod record);

    SchoolPeriod selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(SchoolPeriod record);

    int updateByPrimaryKey(SchoolPeriod record);
    /**
	 * 判断学期重复
	 * @param schoolId
	 * @param period
	 * @return
	 */
	int getPeriodCntByCondition(String schoolId, String period);
	/**
	 * 判断学期排序重复
	 * @param schoolId
	 * @param orderId
	 * @return
	 */
	int getPeriodOrderCntByCondition(String schoolId, int orderId);
	/**
	 * 新增学期
	 * @param schoolId
	 * @param period
	 * @param orderId
	 * @return
	 */
	int addSchoolPeriod(SchoolPeriod schoolPeriod);
	/**
	 * 获取学期对应的学校Id
	 * @param schoolPeriodId
	 * @return
	 */
	SchoolPeriod getSchoolIdByPeriodId(String schoolPeriodId);
	/**
	 * 获取某名称的学期
	 * @param schoolId
	 * @param period
	 * @return
	 */
	SchoolPeriod getSchoolPeriodByPeriod(String schoolId, String period);
	/**
	 * 获取某排序学期
	 * @param schoolId
	 * @param orderId
	 * @return
	 */
	SchoolPeriod getSchoolPeriodByOrder(String schoolId, int orderId);
	/**
	 * 修改学期
	 * @param schoolPeriodId
	 * @param period
	 * @param orderId
	 * @param status
	 * @return
	 */
	int setSchoolPeriod(SchoolPeriod schoolPeriod);
	/**
	 * 获取学期数量
	 * @param schoolId
	 * @return
	 */
	int getPeriodsCnt(Map<String, Object> params);
	/**
	 * 获取学期
	 * @param schoolId
	 * @param page_number
	 * @param page_size
	 * @return
	 */
	List<SchoolPeriod> getPeriods(Map<String, Object> params);
	/**
	 * 设置当前学期
	 * @param schoolPeriodId
	 * @return
	 */
	int setchoolPeriodCurrent(int schoolPeriodId);
	/**
	 * 去除当前学期设置
	 */
	int setchoolPeriodNotCurrent(String schoolId);
	/**
	 * 获取当前学期
	 * @param schoolId
	 * @return
	 */
	int getSchoolPeriodCurrent(String schoolId);
	
}