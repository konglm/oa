package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.AnnouncementMan;

public interface AnnouncementManMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(AnnouncementMan record);

    int insertSelective(AnnouncementMan record);

    AnnouncementMan selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(AnnouncementMan record);

    int updateByPrimaryKey(AnnouncementMan record);
}