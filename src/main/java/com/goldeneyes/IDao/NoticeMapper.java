package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.goldeneyes.pojo.Notice;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}