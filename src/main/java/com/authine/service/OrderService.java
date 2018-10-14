package com.authine.service;

import com.authine.DTO.OrderDTO;
import com.authine.pojo.OrderMain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {
    /**
     * 创建订单
     */
public void createOrder(OrderDTO orderDTO);
    /**
     * 查询订单(全部)
     */
    public Page<OrderDTO> getAll(Pageable pageable);
    /**
     * 修改订单
     */
public void modify(String OrderMain);
    /**
     * 取消订单
     */

    public void console(String orderId);

    /**
     * 支付订单
     */

    public void payOrder();
}
