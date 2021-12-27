package com.goldeneyes.IDao;

import java.util.List;

import com.goldeneyes.pojo.CooperateNoticeReply;

public interface CooperateNoticeReplyMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(CooperateNoticeReply record);

    int insertSelective(CooperateNoticeReply record);

    CooperateNoticeReply selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(CooperateNoticeReply record);

    int updateByPrimaryKey(CooperateNoticeReply record);
}