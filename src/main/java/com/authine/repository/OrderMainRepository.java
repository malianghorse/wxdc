package com.authine.repository;

import com.authine.pojo.OrderMain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderMainRepository extends JpaRepository<OrderMain,String> {

    Page<OrderMain> findByBuyerOpenid(String s, Pageable page);
}
