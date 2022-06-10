package com.jaweee.lottery.domain.strategy.model.vo;

import java.math.BigDecimal;

/**
 * @description: TODO
 * @author: jiawei
 * @date: 2022/6/8 21:51
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
public class AwardRateInfo {
    // 奖品ID
    private String awardId;

    // 中奖概率
    private BigDecimal awardRate;

    public AwardRateInfo() {
    }

    public AwardRateInfo(String awardId, BigDecimal awardRate) {
        this.awardId = awardId;
        this.awardRate = awardRate;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public BigDecimal getAwardRate() {
        return awardRate;
    }

    public void setAwardRate(BigDecimal awardRate) {
        this.awardRate = awardRate;
    }
}
