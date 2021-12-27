package com.goldeneyes.IDao;

import java.util.List;

import com.goldeneyes.pojo.NoticeLetterRow;

public interface NoticeLetterRowMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(NoticeLetterRow record);

    int insertSelective(NoticeLetterRow record);

    NoticeLetterRow selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(NoticeLetterRow record);

    int updateByPrimaryKey(NoticeLetterRow record);

}