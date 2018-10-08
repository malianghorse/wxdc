package com.authine.repository;

import com.authine.pojo.OrderMain;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMainRepositoryTest {

    @Autowired
    private OrderMainRepository orderMainRepository;

    @Test
    public void add() {
        OrderMain orderMain = new OrderMain();
        orderMain.setBuyerAddress("深圳");
        orderMain.setBuyerName("张三");
        orderMain.setBuyerOpenid("100110");
        orderMain.setOrderAmount(new BigDecimal(2.1));
        orderMain.setBuyerPhone("110");
        orderMainRepository.save(orderMain);
    }

    @Test
    public void getByOpenId() {

        Pageable pageable=new PageRequest(0,1);
        Page<OrderMain> byBuyerOpenid=orderMainRepository.findByBuyerOpenid("100110",pageable);
        List<OrderMain> content = byBuyerOpenid.getContent();
        Pageable pageable1 = byBuyerOpenid.getPageable();
        log.info(byBuyerOpenid.toString());
    }

}