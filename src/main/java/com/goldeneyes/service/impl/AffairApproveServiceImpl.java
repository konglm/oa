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

import com.goldeneyes.IDao.AffairApplyMapper;
import com.goldeneyes.IDao.AffairApproveMapper;
import com.goldeneyes.IDao.ApplyTypeMapper;
import com.goldeneyes.pojo.AffairApply;
import com.goldeneyes.pojo.AffairApprove;
import com.goldeneyes.pojo.ApplyType;
import com.goldeneyes.service.AffairApproveService;
import com.goldeneyes.util.CommonTool;

/**
 * @author Administrator
 *
 */
@Service("affairApproveService")
public class AffairApproveServiceImpl implements AffairApproveService {
	@Resource
	AffairApplyMapper affairApplyMapper;
	@Resource
	AffairApproveMapper affairApproveMapper;
	@Resource
	ApplyTypeMapper applyTypeMapper;

	/**
	 *  @author Administrator
	 */
	@Override
	public int getNoApproveCntByMan(String schoolId, Long approveManId) throws Exception {
		// TODO Auto-generated method stub
		return affairApproveMapper.getNoApproveCntByMan(schoolId, approveManId);
	}

}
