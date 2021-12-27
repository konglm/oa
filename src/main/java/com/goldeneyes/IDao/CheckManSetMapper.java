package com.goldeneyes.IDao;

import java.util.List;

import com.goldeneyes.pojo.CheckManSet;

public interface CheckManSetMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(CheckManSet record);

    int insertSelective(CheckManSet record);

    CheckManSet selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(CheckManSet record);

    int updateByPrimaryKey(CheckManSet record);
    /**
     * 新增审核人
     * @param record
     * @return
     */
    int addCheckManSet(CheckManSet record);
    /**
     * 修改审核人
     * @param record
     * @return
     */
    int setCheckManSet(CheckManSet record);
    /**
     * 获取审核人数量
     * @param schoolId
     * @param checkType
     * @return
     */
    int getCheckManSetCntByCondition(String schoolId, int checkType);
    /**
     * 获取是否审核人 
     * @param schoolId
     * @param checkType
     * @param checkManId
     * @return
     */
    int getIsCheckManByCondition(String schoolId, int checkType, long checkManId);
    /**
	 * 获取审核人
	 * @param schoolId
	 * @return
	 */
	CheckManSet getCheckMan(String schoolId, int checkType);
	/**
	 * 获取是否需要审核
	 * @param schoolId
	 * @param checkType
	 * @return
	 */
	int getIsCheckByType(String schoolId, int checkType);
	/**
	 * 获取是否需要审核数量 
	 * @param schoolId
	 * @param checkType
	 * @return
	 */
	int getIsCheckByTypeCnt(String schoolId, int checkType);
}