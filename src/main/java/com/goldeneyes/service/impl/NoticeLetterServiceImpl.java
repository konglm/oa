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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.goldeneyes.IDao.CheckManSetMapper;
import com.goldeneyes.IDao.NoticeLetterCheckMapper;
import com.goldeneyes.IDao.NoticeLetterMapper;
import com.goldeneyes.IDao.NoticeLetterRowMapper;
import com.goldeneyes.pojo.AnnouncementCheck;
import com.goldeneyes.pojo.NoticeLetter;
import com.goldeneyes.pojo.NoticeLetterCheck;
import com.goldeneyes.pojo.NoticeLetterRow;
import com.goldeneyes.service.NoticeLetterService;
import com.goldeneyes.util.CommonTool;

/**
 * @author Administrator
 *
 */
@Service("noticeLetterService")
public class NoticeLetterServiceImpl implements NoticeLetterService {
	@Resource
	NoticeLetterMapper noticeLetterMapper;
	@Resource
	NoticeLetterRowMapper noticeLetterRowMapper;
	@Resource
	NoticeLetterCheckMapper noticeLetterCheckMapper;
	@Resource
	CheckManSetMapper checkManSetMapper;


	/**
	 *  @author Administrator
	 */
	@Override
	public int getCheckNoticeLetterCnt(String schoolId, String name, int type, int status, String beginTime,
			String endTime) throws Exception {
		// TODO Auto-generated method stub
		String beginDate = CommonTool.formatDate(beginTime) + " 00:00:00";
		String endDate = CommonTool.formatDate(endTime) + " 23:59:59";
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("schoolId", schoolId);
		params.put("name", name);
		params.put("type", type);
		params.put("status", status);
		params.put("beginDate", beginDate);
		params.put("endDate", endDate);
		return noticeLetterMapper.getCheckNoticeLetterCnt(params);
	}

}
