package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.goldeneyes.pojo.AffairApply;

public interface AffairApplyMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(AffairApply record);

    int insertSelective(AffairApply record);

    AffairApply selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(AffairApply record);

    int updateByPrimaryKey(AffairApply record);

}