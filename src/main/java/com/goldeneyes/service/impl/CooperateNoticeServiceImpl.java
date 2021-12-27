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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.goldeneyes.IDao.CooperateNoticeManMapper;
import com.goldeneyes.IDao.CooperateNoticeMapper;
import com.goldeneyes.IDao.CooperateNoticeReplyMapper;
import com.goldeneyes.pojo.CooperateNotice;
import com.goldeneyes.pojo.CooperateNoticeMan;
import com.goldeneyes.pojo.CooperateNoticeReply;
import com.goldeneyes.service.CooperateNoticeService;
import com.goldeneyes.util.CommonTool;

/**
 * @author Administrator
 *
 */
@Service("cooperateNoticeService")
public class CooperateNoticeServiceImpl implements CooperateNoticeService {
	@Resource
	CooperateNoticeMapper cooperateNoticeMapper;
	@Resource
	CooperateNoticeManMapper cooperateNoticeManMapper;
	@Resource
	CooperateNoticeReplyMapper cooperateNoticeReplyMapper;

	/**
	 *  @author Administrator
	 */
	@Override
	public int getNoDoneCntByMan(String schoolId, Long receiveManId) throws Exception {
		// TODO Auto-generated method stub
		return cooperateNoticeManMapper.getNoDoneCntByMan(schoolId, receiveManId);
	}

	/**
	 *  @author Administrator
	 */
	@Override
	public int getNewNoReadCntByMan(String schoolId, Long receiveManId) throws Exception {
		// TODO Auto-generated method stub
		return cooperateNoticeManMapper.getNewNoReadCntByMan(schoolId, receiveManId);
	}

}
