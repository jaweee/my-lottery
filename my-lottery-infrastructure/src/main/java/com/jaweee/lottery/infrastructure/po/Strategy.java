package com.jaweee.lottery.infrastructure.po;

import java.util.Date;

/**
 * @description: TODO
 * @author: jiawei
 * @date: 2022/6/9 07:16
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
public class Strategy {

    // 自增id
    private Long id;

    // 策略id
    private Long strategyId;

    // 策略描述
    private String strategyDesc;

    // 策略方式
    private Integer strategyMode;

    // 发放奖品的方式
    private Integer grantType;

    // 发放奖品的时间
    private Date grantDate;

    // 扩展信息
    private String extInfo;

    // 创建时间
    private Date creatTime;

    // 更新时间
    private Date updateTime;


}
