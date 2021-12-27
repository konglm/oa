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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.goldeneyes.IDao.CheckManSetMapper;
import com.goldeneyes.IDao.SchoolCalendarMapper;
import com.goldeneyes.IDao.SchoolPeriodMapper;
import com.goldeneyes.IDao.SchoolPicMapper;
import com.goldeneyes.IDao.SchoolWeekWorkMapper;
import com.goldeneyes.pojo.CheckManSet;
import com.goldeneyes.pojo.SchoolCalendar;
import com.goldeneyes.pojo.SchoolPeriod;
import com.goldeneyes.pojo.SchoolPic;
import com.goldeneyes.pojo.SchoolWeekWork;
import com.goldeneyes.service.PublicService;
import com.goldeneyes.util.CommonTool;

/**
 * @author Administrator
 *
 */
@Service("publicService")
public class PublicServiceImpl implements PublicService {
	@Resource
	CheckManSetMapper checkManSetMapper;
	@Resource
	SchoolPeriodMapper schoolPeriodMapper;
	@Resource
	SchoolPicMapper schoolPicMapper;

	/**
	 *  @author Administrator
	 */
	@Override
	public int setCheckMan(String schoolId, int checkType, Long checkManId, String checkManCode,
			String checkManName, String checkManPic, int isCheck) throws Exception {
		// TODO Auto-generated method stub
		int cnt = checkManSetMapper.getCheckManSetCntByCondition(schoolId, checkType);
		
		CheckManSet checkManSet = new CheckManSet();
		checkManSet.setSchoolid(schoolId);
		checkManSet.setCheckmanid(checkManId);
		checkManSet.setCheckmancode(checkManCode);
		checkManSet.setCheckmanname(checkManName);
		checkManSet.setCheckmanpic(checkManPic);
		checkManSet.setChecktype(checkType);
		checkManSet.setIscheck(CommonTool.int2byte(isCheck));
		if(cnt <= 0) {
			return checkManSetMapper.addCheckManSet(checkManSet);
		} else {
			return checkManSetMapper.setCheckManSet(checkManSet);
		}
	}	

	/**
	 *  @author Administrator
	 */
	@Override
	public int getIsCheckManByCondition(String schoolId, int checkType, long checkManId) throws Exception {
		// TODO Auto-generated method stub
		return checkManSetMapper.getIsCheckManByCondition(schoolId, checkType, checkManId);
	}

	/**
	 *  @author Administrator
	 */
	@Override
	public CheckManSet getCheckMan(String schoolId, int checkType) throws Exception {
		// TODO Auto-generated method stub
		return checkManSetMapper.getCheckMan(schoolId, checkType);
	}

}
