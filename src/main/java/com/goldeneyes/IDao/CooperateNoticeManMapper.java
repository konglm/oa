package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;
import com.goldeneyes.pojo.CooperateNoticeMan;

public interface CooperateNoticeManMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(CooperateNoticeMan record);

    int insertSelective(CooperateNoticeMan record);

    CooperateNoticeMan selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(CooperateNoticeMan record);

    int updateByPrimaryKey(CooperateNoticeMan record);
    /**
     * 获取某人未处理个数
     * @param schoolId
     * @param receiveManId
     * @return
     */
    int getNoDoneCntByMan(String schoolId, Long receiveManId);
    /**
     * 获取协同事务未读数
     * @param schoolId
     * @param receiveManId
     * @return
     */
    int getNewNoReadCntByMan(String schoolId, Long receiveManId);
}