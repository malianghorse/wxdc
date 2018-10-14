package com.authine.service;

import com.authine.pojo.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductInfoService {
    Page<ProductInfo> getAll(Pageable pageable);

    Optional<ProductInfo> getById(String s);
    ProductInfo save(ProductInfo productInfo);
}
