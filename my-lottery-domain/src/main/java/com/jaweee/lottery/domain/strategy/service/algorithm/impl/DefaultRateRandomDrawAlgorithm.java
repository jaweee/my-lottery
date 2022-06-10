package com.jaweee.lottery.domain.strategy.service.algorithm.impl;

import com.jaweee.lottery.domain.strategy.model.vo.AwardRateInfo;
import com.jaweee.lottery.domain.strategy.service.algorithm.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: jiawei
 * @date: 2022/6/8 21:49
 * @github: https://github.com/jaweee
 * @version: 1.0
 */
@Component("defaultRateRandomDrawAlgorithm")
public class DefaultRateRandomDrawAlgorithm extends BaseAlgorithm {
    @Override
    public String randomDraw(Long strategyId, List<String> excludeAward) {
        // 现将未排除的awardId筛选出来
        List<AwardRateInfo> includeAwardList = new ArrayList<>();
        List<AwardRateInfo> awardRateInfoList = awardRateInfoMap.get(strategyId);
        // 除去未包含的奖品的所有奖品的总概率
        BigDecimal includeRateTotal = new BigDecimal(0);
        for (AwardRateInfo awardRateInfo : awardRateInfoList){
            if (excludeAward.contains(awardRateInfo.getAwardId())){
                continue;
            }
            includeAwardList.add(awardRateInfo);
            includeRateTotal = includeRateTotal.add(awardRateInfo.getAwardRate());
        }
        if (0 == includeAwardList.size()) return "未中奖";
        if (1 == includeAwardList.size()) return includeAwardList.get(0).getAwardId();

        // 获取随机值
        int randomVal = new SecureRandom().nextInt(100)+1;

        // 遍历除去未包含的awardList，看随机值是否命中在变化后的区间
        int cursorVal = 0;
        String hitAwardId = "";
        for (AwardRateInfo awardRateInfo : includeAwardList){
            int rateVal = awardRateInfo.getAwardRate().divide(includeRateTotal, 2, BigDecimal.ROUND_UP).multiply(new BigDecimal(100)).intValue();
            if (randomVal <= cursorVal+rateVal){
                hitAwardId = awardRateInfo.getAwardId();
                break;
            }
            cursorVal += rateVal;
        }
        return hitAwardId;
    }
}
