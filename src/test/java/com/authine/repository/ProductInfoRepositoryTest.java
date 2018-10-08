package com.authine.repository;

import com.authine.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void test1(){
//        List<ProductInfo> all = productInfoRepository.findAll();
//        for (int i=0;i<all.size()-1;i++){
//            System.out.println(all.get(i));
//        }
        ProductInfo productInfo=new ProductInfo();
//        productInfo.setProductId("1");
//        productInfo.setProductId("297e4e96662b2c7a01662b2c86a60000");
//        productInfo.setProductName("避孕套");
//        productInfo.setProductDescribe("很安全,很给力");
//        productInfo.setProductStore(100);
//        productInfo.setProductType(1);
//
//        productInfo.setProductPrice(new BigDecimal(5));
//        productInfoRepository.save(productInfo);
        Optional<ProductInfo> byId = productInfoRepository.findById("297e4e96662b2c7a01662b2c86a60000");
        System.out.printf(byId.toString());
//        Assert.assertNotNull();

    }
}
