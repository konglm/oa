package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.ApplyType;

public interface ApplyTypeMapper {
    int insert(ApplyType record);

    int insertSelective(ApplyType record);   
    /**
	 * 判断是否重名
	 * @param schoolId
	 * @param typeName
	 * @return
	 * @throws Exception
	 */
	int getApplyTypeCountByCondition(String schoolId,String typeName);
	/**
	 * 新增申请类型
	 * @param applyType
	 * @return
	 * @throws Exception
	 */
	int addApplyType(ApplyType applyType);
	/**
	 * 通过id获取学校ID
	 * @param typeId
	 * @return
	 * @throws Exception
	 */
	ApplyType getSchoolIdByRecordId(int typeId);
	/**
	 * 获取条件下的申请类型
	 * @param schoolId
	 * @param typeName
	 * @return
	 * @throws Exception
	 */
	ApplyType getTableRecordByCondition(String schoolId,String typeName);
	/**
	 * 编辑申请类型
	 * @param applyType
	 * @return
	 * @throws Exception
	 */
	int setApplyType(ApplyType applyType);
	/**
	 * 删除申请类型
	 * @param typeId
	 * @return
	 * @throws Exception
	 */
	int delApplyType(int typeId);
	/**
	 * 获取申请类型列表
	 * @param params
	 * @return
	 */
	List<ApplyType> getTypes(Map<String, Object> params);
	/**
	 * 获取申请类型数量
	 * @param params
	 * @return
	 */
	int getTypesCnt(Map<String, Object> params);
}