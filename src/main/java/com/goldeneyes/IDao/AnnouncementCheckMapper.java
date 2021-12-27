package com.goldeneyes.IDao;

import com.goldeneyes.pojo.AnnouncementCheck;

public interface AnnouncementCheckMapper {
    int deleteByPrimaryKey(Integer tabid);

    int insert(AnnouncementCheck record);

    int insertSelective(AnnouncementCheck record);

    AnnouncementCheck selectByPrimaryKey(Integer tabid);

    int updateByPrimaryKeySelective(AnnouncementCheck record);

    int updateByPrimaryKey(AnnouncementCheck record);
    /**
     * 新增公告审核
     * @param ac
     * @return
     */
    int addAnnouncementCheck(AnnouncementCheck ac);
    /**
     * 审核公告通过
     * @param announcementId
     * @return
     */
    int setAnnouncementCheck(int announcementId);
}