package com.jaweee.lottery.domain.strategy.model.aggregates;

import com.jaweee.lottery.infrastructure.po.Strategy;
import com.jaweee.lottery.infrastructure.po.StrategyDetail;

import java.util.List;

/**
 * @description: 聚合了相关表的信息，一个策略id对应多个策略详细信息
 * @author: jiawei
 * @date: 2022/6/8 21:51
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
public class StrategyRich {

    // 策略ID
    private Long strategyId;
    // 策略配置
    private Strategy strategy;
    // 策略明细
    private List<StrategyDetail> strategyDetailList;

    public StrategyRich() {
    }

    public StrategyRich(Long strategyId, Strategy strategy, List<StrategyDetail> strategyDetailList) {
        this.strategyId = strategyId;
        this.strategy = strategy;
        this.strategyDetailList = strategyDetailList;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<StrategyDetail> getStrategyDetailList() {
        return strategyDetailList;
    }

    public void setStrategyDetailList(List<StrategyDetail> strategyDetailList) {
        this.strategyDetailList = strategyDetailList;
    }
}
