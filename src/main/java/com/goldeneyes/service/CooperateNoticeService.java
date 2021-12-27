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

/**
 * @author Administrator
 *
 */
public interface CooperateNoticeService {
	/**
	 * 获取某人未处理个数
	 * @param schoolId
	 * @param receiveManId
	 * @return
	 * @throws Exception
	 */
	public int getNoDoneCntByMan(String schoolId, Long receiveManId) throws Exception;
	/**
	 * 获取协同事务未读数
	 * @param unit_code
	 * @param user_code
	 * @return
	 * @throws Exception
	 */
	public int getNewNoReadCntByMan(String schoolId, Long receiveManId) throws Exception;

}
