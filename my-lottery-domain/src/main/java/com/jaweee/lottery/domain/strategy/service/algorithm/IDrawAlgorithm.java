package com.jaweee.lottery.domain.strategy.service.algorithm;

import com.jaweee.lottery.domain.strategy.model.vo.AwardRateInfo;

import java.util.List;

public interface IDrawAlgorithm {

    /**
     *
     * @param strategyId
     * @param awardRateInfoList
     */
    void initRateTuple(Long strategyId, List<AwardRateInfo> awardRateInfoList);

    /**
     *
     * @param strategyId
     */
    void isExistRateTuple(Long strategyId);

    /**
     *
     * @param strategyId
     * @param excludeAward
     * @return
     */
    String randomDraw(Long strategyId, List<String> excludeAward);
}
