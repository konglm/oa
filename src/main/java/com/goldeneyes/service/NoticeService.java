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
public interface NoticeService {
	/**
	 * 获取未读数量
	 * @param schoolId
	 * @param receiveManId
	 * @return
	 * @throws Exception
	 */
	public int getNoReadCntByMan(String schoolId, Long receiveManId) throws Exception;

}
