package com.authine.service.imp;

import com.authine.pojo.ProductCategory;
import com.authine.repository.ProductCategoryRepository;
import com.authine.service.ProductCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductCategoryServiceImpl  implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> getAll() {
        List<ProductCategory> all = productCategoryRepository.findAll();

        return all;
    }
}
