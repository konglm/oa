package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.goldeneyes.pojo.AffairApprove;

public interface AffairApproveMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(AffairApprove record);

    int insertSelective(AffairApprove record);

    AffairApprove selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(AffairApprove record);

    int updateByPrimaryKey(AffairApprove record);
    /**
     * 获取未审批数量
     * @param schoolId
     * @param approveManId
     * @return
     */
    int getNoApproveCntByMan(String schoolId, Long approveManId);
}