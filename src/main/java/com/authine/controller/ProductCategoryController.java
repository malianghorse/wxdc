package com.authine.controller;


import com.authine.pojo.ProductCategory;
import com.authine.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/productCategory")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @ResponseBody
    @RequestMapping
    public List<ProductCategory> getAll(){
        List<ProductCategory> all = productCategoryService.getAll();
        return all;

    }
}

