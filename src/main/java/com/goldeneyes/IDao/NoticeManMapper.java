package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.goldeneyes.pojo.NoticeMan;

public interface NoticeManMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(NoticeMan record);

    int insertSelective(NoticeMan record);

    NoticeMan selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(NoticeMan record);

    int updateByPrimaryKey(NoticeMan record);
    /**
     * 获取未读数量
     * @param schoolId
     * @param receiveManId
     * @return
     */
    int getNoticeNoReadCntByMan(String schoolId, Long receiveManId);
}