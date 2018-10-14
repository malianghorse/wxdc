package com.authine.service.imp;

import com.authine.pojo.ProductInfo;
import com.authine.repository.ProductInfoRepository;
import com.authine.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {


    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public  Optional<ProductInfo> getById(String s) {
        Optional<ProductInfo> byId = productInfoRepository.findById(s);
        return byId;
    }
    @Override
    /**  Ctrl+o  重写快捷键 */
    public Page<ProductInfo> getAll(Pageable pageable) {

        Page<ProductInfo> all = productInfoRepository.findAll(pageable);
        return all;
    }
    @Override

    public ProductInfo save(ProductInfo productInfo) {
        ProductInfo save = productInfoRepository.save(productInfo);
        return save;
    }
}
