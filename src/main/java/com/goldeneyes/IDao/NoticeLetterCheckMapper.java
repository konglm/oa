package com.goldeneyes.IDao;

import com.goldeneyes.pojo.NoticeLetterCheck;

public interface NoticeLetterCheckMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(NoticeLetterCheck record);

    int insertSelective(NoticeLetterCheck record);

    NoticeLetterCheck selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(NoticeLetterCheck record);

    int updateByPrimaryKey(NoticeLetterCheck record);
    /**
     * 新增审核表
     * @param record
     * @return
     */
    int addNoticeLetterCheck(NoticeLetterCheck record);
    /**
     * 审核通知单
     * @param letterId
     * @return
     */
    int setNoticeLetterCheck(int letterId);
}