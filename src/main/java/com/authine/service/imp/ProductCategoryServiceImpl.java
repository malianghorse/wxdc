package com.authine.service.imp;

import com.authine.pojo.ProductCategory;
import com.authine.repository.ProductCategoryRepository;
import com.authine.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl  implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> getAll() {
        List<ProductCategory> all = productCategoryRepository.findAll();
        return all;
    }
}
