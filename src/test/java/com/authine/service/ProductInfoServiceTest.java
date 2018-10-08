package com.authine.service;

import com.authine.enums.ProductState;
import com.authine.pojo.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoServiceTest {

    @Autowired
    private ProductInfoService productInfoService;
    @Test
    public void getAll() {
//        Pageable pageable=new PageRequest(0,1);
        Pageable pageable= PageRequest.of(0, 1);
        Page<ProductInfo> all = productInfoService.getAll(pageable);
//        for(int i=0;i<all.size();i++){
//            log.info(all.get(i).toString());
//
//        }
//        Assert.
    }

    @Test
    public void getById() {
        int code = ProductState.DOWN.getCode();
        String msg = ProductState.DOWN.getMsg();
        log.info("code:{},msg:{}",code,msg);
//        log.info("msg:{}"+msg);
    }
}