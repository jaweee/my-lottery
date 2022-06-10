package com.jaweee.lottery.domain.strategy.service.algorithm;

import com.jaweee.lottery.domain.strategy.model.vo.AwardRateInfo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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

    // 用于单体算法，前后的中将概率不变，只在奖品被抽完后不在中奖
    // 一开始就规定好所有的中奖区间
    protected Map<Long, String[]> rateTupleMap = new ConcurrentHashMap<>();

    // 用于总体算法，也即肯定能中奖的算法。通过遍历对应策略id所有的AwardInfo，不断地匹配到固定区间，看是否中奖
    // 中奖区间是变化的，根据奖品是否被抽完来动态确定
    protected Map<Long, List<AwardRateInfo>> awardRateInfoMap = new ConcurrentHashMap<>();

    /**
     * 初始化将在算法中实现的待用基本数据
     * @param strategyId
     * @param awardRateInfoList
     */
    @Override
    public void initRateTuple(Long strategyId, List<AwardRateInfo> awardRateInfoList) {

        awardRateInfoMap.put(strategyId, awardRateInfoList);

        String[] rateTuple = rateTupleMap.computeIfAbsent(strategyId, k -> new String[RATE_TUPLE_LENGTH]);
        int cursorVal = 0;
        for(AwardRateInfo awardRateInfo : awardRateInfoList){
            int rateVal = awardRateInfo.getAwardRate().multiply(new BigDecimal(100)).intValue();
            // 将固定的中奖区间散列开来
            for (int i = cursorVal+1; i<(cursorVal+rateVal); i++){
                rateTuple[hash_idx(i)] = awardRateInfo.getAwardId();
            }
            // 下一个中间区间[cursorVal+1, cursorVal+rateVal]
            cursorVal += rateVal;
        }
    }

    @Override
    public boolean isExistRateTuple(Long strategyId) {
        return rateTupleMap.containsKey(strategyId);
    }

    public Integer hash_idx(int val){
        int hashCode = val * HASH_INCREMENT + HASH_INCREMENT;
        return hashCode & (RATE_TUPLE_LENGTH - 1);
    }

}
