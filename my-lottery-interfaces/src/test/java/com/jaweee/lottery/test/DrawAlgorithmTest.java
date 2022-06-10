package com.jaweee.lottery.test;

import com.jaweee.lottery.domain.strategy.model.vo.AwardRateInfo;
import com.jaweee.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: me
 * @title: DrawAlgorithmTest
 * @description:
 * @date: 2022/6/10 12:04
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class DrawAlgorithmTest {

//    @Resource(name = "defaultRateRandomDrawAlgorithm")
    @Resource(name = "singleRateRandomDrawAlgorithm")
    private IDrawAlgorithm randomDrawAlgorithm;

    @Before
    public void init(){
        List<AwardRateInfo> awardRateInfoList = new ArrayList<>();

        awardRateInfoList.add(new AwardRateInfo("一等奖: macbook pro", new BigDecimal(0.05)));
        awardRateInfoList.add(new AwardRateInfo("二等奖: macbook air", new BigDecimal(0.15)));
        awardRateInfoList.add(new AwardRateInfo("三等奖: ipad pro", new BigDecimal(0.2)));
        awardRateInfoList.add(new AwardRateInfo("四等奖: iphone", new BigDecimal(0.25)));
        awardRateInfoList.add(new AwardRateInfo("五等奖: air pods pro", new BigDecimal(0.35)));

        randomDrawAlgorithm.initRateTuple(100001L, awardRateInfoList);
    }

    @Test
    public void testRandomDrawAlgorithm(){
        List<String> excludeAward = new ArrayList<>();
        excludeAward.add("一等奖: macbook pro");
        excludeAward.add("三等奖: ipad pro");

        for (int i=0; i<10; i++){
            String awardId = randomDrawAlgorithm.randomDraw(100001L, excludeAward);
            System.out.println("中奖："+awardId);
        }
    }
}
