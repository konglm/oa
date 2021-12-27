package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.InfoCollect;
import com.goldeneyes.pojo.Notice;

public interface InfoCollectMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(InfoCollect record);

    int insertSelective(InfoCollect record);

    InfoCollect selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(InfoCollect record);

    int updateByPrimaryKey(InfoCollect record);
}