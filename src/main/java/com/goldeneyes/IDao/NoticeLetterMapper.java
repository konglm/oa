package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.NoticeLetter;

public interface NoticeLetterMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(NoticeLetter record);

    int insertSelective(NoticeLetter record);

    NoticeLetter selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(NoticeLetter record);

    int updateByPrimaryKey(NoticeLetter record);
    /**
     * 获取审核的通知单数量
     * @param params
     * @return
     */
    int getCheckNoticeLetterCnt(Map<String, Object> params);
}