package com.authine.pojo;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "product_info")
@Entity
public class ProductInfo {
    private String productId;
    private BigDecimal productPrice;
    private String productName;
    private int productStore;
    private String productDescribe;
    private String productIcon;
    private String createTime;
    private String updateTime;
    private int productType;
    private Integer productState;
    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId='" + productId + '\'' +
                ", productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                ", productStore=" + productStore +
                ", productDescribe='" + productDescribe + '\'' +
                ", productIcon='" + productIcon + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", productType=" + productType +
                '}';
    }

    @Id
//    @GenericGenerator(name = "user-uuid", strategy = "uuid")
    @GenericGenerator(name = "user-uuid",strategy = "uuid")
    @GeneratedValue(generator = "user-uuid")
    public String getProductId() {
        return productId;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductStore() {
        return productStore;
    }

    public String getProductDescribe() {
        return productDescribe;
    }




    public int getProductType() {
        return productType;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductStore(int productStore) {
        this.productStore = productStore;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public Integer getProductState() {
        return productState;
    }

    public void setProductState(Integer productState) {
        this.productState = productState;
    }
}
