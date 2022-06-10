package com.jaweee.lottery.domain.strategy.service.algorithm.impl;

import com.jaweee.lottery.domain.strategy.model.vo.AwardRateInfo;
import com.jaweee.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.List;

/**
 * @description: TODO
 * @author: jiawei
 * @date: 2022/6/9 07:14
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
@Component("singleRateRandomDrawAlgorithm")
public class SingleRateRandomDrawAlgorithm extends BaseAlgorithm {
    @Override
    public String randomDraw(Long strategyId, List<String> excludeAward) {
        // 利用父类的protected 变量 rateTupleMap，获取存储散列后的awardId
        String[] awardIdHash = rateTupleMap.get(strategyId);

        // 随机变量
        int randomVal =new SecureRandom().nextInt(100)+1;

        // 再去根据散列获取随机value的
        String awardId = awardIdHash[hash_idx(randomVal)];
        if (excludeAward.contains(awardId))
            return "未中奖";
        return awardId;
    }
}
