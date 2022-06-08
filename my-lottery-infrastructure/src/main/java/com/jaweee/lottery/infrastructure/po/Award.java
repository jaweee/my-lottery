package com.jaweee.lottery.infrastructure.po;

import java.util.Date;

/**
 * @description: TODO
 * @author: jiawei
 * @date: 2022/6/9 07:17
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
public class Award {

    // 自增id
    private Long id;

    // 奖品id
    private Long awardId;

    // 奖品类型
    private Integer awardType;

    // 奖品数量
    private Integer awardCount;

    // 奖品名称
    private String awardName;

    // 奖品内容
    private String awardContent;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAwardId() {
        return awardId;
    }

    public void setAwardId(Long awardId) {
        this.awardId = awardId;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public Integer getAwardCount() {
        return awardCount;
    }

    public void setAwardCount(Integer awardCount) {
        this.awardCount = awardCount;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardContent() {
        return awardContent;
    }

    public void setAwardContent(String awardContent) {
        this.awardContent = awardContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}