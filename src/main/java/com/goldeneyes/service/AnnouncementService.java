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

import com.goldeneyes.pojo.SchoolCalendar;
import com.goldeneyes.pojo.SchoolPic;
import com.goldeneyes.pojo.SchoolWeekWork;

/**
 * @author Administrator
 *
 */
public interface AnnouncementService {
	/**
	 * 获取审核的公告数量
	 * @param schoolId
	 * @param title
	 * @param checkStatus
	 * @param beginTime
	 * @param endTime
	 * @return
	 * @throws Exception
	 */
	public int getCheckAnnouncementCnt(String schoolId, String title, int checkStatus, String beginTime, String endTime, int type, String sendMan) throws Exception;
}
