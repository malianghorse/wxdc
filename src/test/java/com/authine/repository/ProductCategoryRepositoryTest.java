package com.authine.repository;

import com.authine.pojo.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void insert(){
//        ProductCategory productCategory=new ProductCategory();
//        productCategory.setCategoryName("日用品1");
//        productCategory.setCategoryNum(1);
//        ProductCategory save = productCategoryRepository.save(productCategory);
//        Assert.assertEquals(new String("日用品1"),save.getCategoryName());

        Optional<ProductCategory> id = productCategoryRepository.findById(new Integer(2));
        ProductCategory productCategory = id.get();
        productCategory.setCategoryName("食品");
        this.productCategoryRepository.save(productCategory);
    }
}