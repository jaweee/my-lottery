package com.jaweee.lottery.infrastructure.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: TODO
 * @author: jiawei
 * @date: 2022/6/9 07:16
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
public class StrategyDetail {

    // 自增id
    private Long id;

    // 策略id
    private Long strategyId;

    // 奖品id
    private Long awardId;

    // 将品数量
    private Integer awardCount;

    // 将品中奖概率
    private BigDecimal awardRate;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Long getAwardId() {
        return awardId;
    }

    public void setAwardId(Long awardId) {
        this.awardId = awardId;
    }

    public Integer getAwardCount() {
        return awardCount;
    }

    public void setAwardCount(Integer awardCount) {
        this.awardCount = awardCount;
    }

    public BigDecimal getAwardRate() {
        return awardRate;
    }

    public void setAwardRate(BigDecimal awardRate) {
        this.awardRate = awardRate;
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
