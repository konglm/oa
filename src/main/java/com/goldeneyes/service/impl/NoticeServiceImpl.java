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

import com.goldeneyes.IDao.NoticeManMapper;
import com.goldeneyes.IDao.NoticeMapper;
import com.goldeneyes.pojo.Notice;
import com.goldeneyes.pojo.NoticeMan;
import com.goldeneyes.service.NoticeService;
import com.goldeneyes.util.CommonTool;

/**
 * @author Administrator
 *
 */
@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
	@Resource
	NoticeMapper noticeMapper;
	@Resource
	NoticeManMapper noticeManMapper;

	/**
	 *  @author Administrator
	 */
	@Override
	public int getNoReadCntByMan(String schoolId, Long receiveManId) throws Exception {
		// TODO Auto-generated method stub
		return noticeManMapper.getNoticeNoReadCntByMan(schoolId, receiveManId);
	}

}
