package com.goldeneyes.IDao;

import java.util.List;
import java.util.Map;

import com.goldeneyes.pojo.InfoUpload;

public interface InfoUploadMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(InfoUpload record);

    int insertSelective(InfoUpload record);

    InfoUpload selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(InfoUpload record);

    int updateByPrimaryKey(InfoUpload record);
    /**
     * 获取某人未上交个数
     * @param schoolId
     * @param receiveManId
     * @return
     */
    int getNoUploadCntByMan(String schoolId, Long receiveManId);
}