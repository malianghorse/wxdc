package com.authine.service.imp;

import com.authine.DTO.OrderDTO;
import com.authine.pojo.OrderDetail;
import com.authine.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {
    @Autowired
    OrderService orderService;
    @Test
    public void createOrder() {
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setBuyerAddress("深圳");
        orderDTO.setBuyerOpenid("110");
        orderDTO.setBuyerName("马亮");
        orderDTO.setBuyerPhone("111");
        List<OrderDetail> list=new ArrayList<>();
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setProductId("297e4e96662b2c7a01662b2c86a60000");
        orderDetail.setProductQuantity(2);
        list.add(orderDetail);
        orderDTO.setOrderList(list);
        orderService.createOrder(orderDTO);
    }
}