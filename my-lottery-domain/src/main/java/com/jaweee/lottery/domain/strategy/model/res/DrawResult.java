package com.jaweee.lottery.domain.strategy.model.res;

/**
 * @description: 封装抽奖结果后的主要值：策略id，奖品id，奖品name
 * @author: jiawei
 * @date: 2022/6/9 07:13
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
public class DrawResult {

    private String uId;

    private Long strategyId;

    private Long rewardId;

    private String rewardName;

    public DrawResult() {
    }

    public DrawResult(String uId, Long strategyId, Long rewardId, String rewardName) {
        this.uId = uId;
        this.strategyId = strategyId;
        this.rewardId = rewardId;
        this.rewardName = rewardName;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Long getRewardId() {
        return rewardId;
    }

    public void setRewardId(Long rewardId) {
        this.rewardId = rewardId;
    }

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }
}
