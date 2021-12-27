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

import com.goldeneyes.IDao.InfoCollectMapper;
import com.goldeneyes.IDao.InfoUploadMapper;
import com.goldeneyes.pojo.InfoCollect;
import com.goldeneyes.pojo.InfoUpload;
import com.goldeneyes.pojo.NoticeMan;
import com.goldeneyes.service.InfoCollectService;
import com.goldeneyes.util.CommonTool;

/**
 * @author Administrator
 *
 */
@Service("infoCollectService")
public class InfoCollectServiceImpl implements InfoCollectService {
	@Resource
	InfoCollectMapper infoCollectMapper;
	@Resource
	InfoUploadMapper infoUploadMapper;

	/**
	 *  @author Administrator
	 */
	@Override
	public int getNoUploadCntByMan(String schoolId, Long receiveManId) throws Exception {
		// TODO Auto-generated method stub
		return infoUploadMapper.getNoUploadCntByMan(schoolId, receiveManId);
	}

}
