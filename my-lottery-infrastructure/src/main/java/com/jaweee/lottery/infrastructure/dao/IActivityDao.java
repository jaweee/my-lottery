package com.jaweee.lottery.infrastructure.dao;

import com.jaweee.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: me
 * @title: IActivityDao
 * @description:
 * @date: 2022/6/8 20:49
 */
@Mapper
public interface IActivityDao {

    public void insert(Activity activity);

    public Activity queryByActivityId(Long activityId);
}
