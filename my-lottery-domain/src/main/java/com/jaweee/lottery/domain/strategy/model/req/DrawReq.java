package com.jaweee.lottery.domain.strategy.model.req;

/**
 * @description:  封装策略核心参数的类
 * @author: jiawei
 * @date: 2022/6/9 07:12
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
public class DrawReq {

    private String uId;

    private Long strategyId;

    public DrawReq(String uId, Long strategyId) {
        this.uId = uId;
        this.strategyId = strategyId;
    }

    public DrawReq() {
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
}
