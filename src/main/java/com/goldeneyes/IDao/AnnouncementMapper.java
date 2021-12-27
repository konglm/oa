package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.Announcement;

public interface AnnouncementMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    Announcement selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);
    /**
     * 获取审核的公告数量
     * @param params
     * @return
     */
    int getCheckAnnouncementCnt(Map<String, Object> params);
}