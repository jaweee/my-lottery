package com.jaweee.lottery.domain.strategy.service.algorithm;

import com.jaweee.lottery.infrastructure.po.Strategy;

/**
 * @description: TODO
 * @author: jiawei
 * @date: 2022/6/8 21:47
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
public abstract class BaseAlgorithm implements IDrawAlgorithm{

    private final int HASH_INCREMENT = 0x61c88647;

    private final int RATE_TUPLE_LENGTH = 128;

    /**
     * 初始化一个数组，让其对应抽奖
     * @param strategyId
     */
    public void initRateTuple(Strategy strategyId){

    }

    public Integer hash_idx(int val){
        int hashCode = val * HASH_INCREMENT + HASH_INCREMENT;
        return hashCode & (RATE_TUPLE_LENGTH - 1);
    }

}
