package com.authine.controller;


import com.authine.pojo.ProductInfo;
import com.authine.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/productInfo")
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @ResponseBody
    @RequestMapping(value = "/{page}/{size}",method = RequestMethod.GET)
    public Page<ProductInfo>  getAll(@PathVariable("page") int page,@PathVariable("size") int size){
        Pageable pageable= PageRequest.of(page, size);
        Page<ProductInfo> all = productInfoService.getAll(pageable);

        return all;
    }

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Optional<ProductInfo> getById(@PathVariable("id") String id){


        Optional<ProductInfo> byId = productInfoService.getById(id);
        return byId;
    }
}
