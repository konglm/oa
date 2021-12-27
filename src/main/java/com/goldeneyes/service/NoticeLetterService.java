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

import com.goldeneyes.pojo.NoticeLetter;
import com.goldeneyes.pojo.NoticeLetterRow;

/**
 * @author Administrator
 *
 */
public interface NoticeLetterService {
	/**
	 *  获取审核的通知单数量
	 * @param schoolId
	 * @param name
	 * @param type
	 * @param status
	 * @param beginTime
	 * @param endTime
	 * @return
	 * @throws Exception
	 */
	public int getCheckNoticeLetterCnt(String schoolId, String name, int type, int status, String beginTime, String endTime)
			throws Exception;

}
