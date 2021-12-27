/*----------------------------------------------------------------
 *  Copyright (C) 2017山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：
 * 文件功能描述：
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package com.goldeneyes.service;

import java.util.List;

import com.goldeneyes.pojo.CheckManSet;
import com.goldeneyes.pojo.SchoolCalendar;
import com.goldeneyes.pojo.SchoolPeriod;
import com.goldeneyes.pojo.SchoolPic;
import com.goldeneyes.pojo.SchoolWeekWork;

/**
 * @author Administrator
 *
 */
public interface PublicService {

	/**
	 * 修改审核人
	 * @param checkManId
	 * @param checkManCode
	 * @param checkManName
	 * @param checkManPic
	 * @return
	 * @throws Exception
	 */
	public int setCheckMan(String schoolId, int checkType, Long checkManId, String checkManCode, String checkManName, String checkManPic, int isCheck) throws Exception;
	/**
	 * 获取是否审核人
	 * @param schoolId
	 * @param checkType
	 * @param checkManId
	 * @return
	 * @throws Exception
	 */
	public int getIsCheckManByCondition(String schoolId, int checkType, long checkManId) throws Exception;
	/**
	 * 获取审核人
	 * @param schoolId
	 * @return
	 * @throws Exception
	 */
	public CheckManSet getCheckMan(String schoolId, int checkType) throws Exception;
}
