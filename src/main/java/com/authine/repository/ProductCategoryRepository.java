package com.authine.repository;

import com.authine.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Integer> {

}
