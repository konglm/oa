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

package com.goldeneyes.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.goldeneyes.IDao.AnnouncementCheckMapper;
import com.goldeneyes.IDao.AnnouncementManMapper;
import com.goldeneyes.IDao.AnnouncementMapper;
import com.goldeneyes.IDao.CheckManSetMapper;
import com.goldeneyes.IDao.SchoolCalendarCheckMapper;
import com.goldeneyes.IDao.SchoolCalendarMapper;
import com.goldeneyes.IDao.SchoolPeriodMapper;
import com.goldeneyes.IDao.SchoolWeekWorkCheckMapper;
import com.goldeneyes.IDao.SchoolWeekWorkMapper;
import com.goldeneyes.pojo.Announcement;
import com.goldeneyes.pojo.AnnouncementCheck;
import com.goldeneyes.pojo.AnnouncementMan;
import com.goldeneyes.pojo.Notice;
import com.goldeneyes.pojo.NoticeMan;
import com.goldeneyes.pojo.SchoolCalendar;
import com.goldeneyes.pojo.SchoolCalendarCheck;
import com.goldeneyes.pojo.SchoolPeriod;
import com.goldeneyes.pojo.SchoolPic;
import com.goldeneyes.pojo.SchoolWeekWork;
import com.goldeneyes.pojo.SchoolWeekWorkCheck;
import com.goldeneyes.service.AnnouncementService;
import com.goldeneyes.util.CommonTool;

/**
 * @author Administrator
 *
 */
@Service("announcementService")
public class AnnouncementServiceImpl implements AnnouncementService {
	@Resource
	CheckManSetMapper announcementSetMapper;
	@Resource
	AnnouncementMapper announcementMapper;
	@Resource
	AnnouncementManMapper announcementManMapper;
	@Resource
	CheckManSetMapper checkManSetMapper;
	@Resource
	SchoolPeriodMapper schoolPeriodMapper;
	@Resource
	AnnouncementCheckMapper announcementCheckMapper;
	@Resource
	SchoolCalendarCheckMapper schoolCalendarCheckMapper;
	@Resource
	SchoolWeekWorkCheckMapper schoolWeekWorkCheckMapper;
	@Resource
	SchoolWeekWorkMapper schoolWeekWorkMapper;
	@Resource
	SchoolCalendarMapper schoolCalendarMapper;

	/**
	 *  @author Administrator
	 */
	@Override
	public int getCheckAnnouncementCnt(String schoolId, String title, int checkStatus, String beginTime, String endTime, int type, String sendMan)
			throws Exception {
		// TODO Auto-generated method stub
		String beginDate = CommonTool.formatDate(beginTime) + " 00:00:00";
		String endDate = CommonTool.formatDate(endTime) + " 23:59:59";
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("schoolId", schoolId);
		params.put("title", title);
		params.put("checkStatus", checkStatus);
		params.put("beginDate", beginDate);
		params.put("endDate", endDate);
		params.put("type", type);
		params.put("sendMan", sendMan);
		return announcementMapper.getCheckAnnouncementCnt(params);
	}

}
