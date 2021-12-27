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

import com.goldeneyes.pojo.AffairApply;
import com.goldeneyes.pojo.AffairApprove;
import com.goldeneyes.pojo.ApplyType;

/**
 * @author Administrator
 *
 */
public interface AffairApproveService {
	/**
	 * 
	 * @param schoolId
	 * @param approveManId
	 * @return
	 * @throws Exception
	 */
	public int getNoApproveCntByMan(String schoolId, Long approveManId) throws Exception;

}
