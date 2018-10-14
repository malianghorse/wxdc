package com.authine.service.imp;

import com.authine.DTO.OrderDTO;
import com.authine.enums.ExceptionMsg;
import com.authine.enums.ProductState;
import com.authine.exception.SellException;
import com.authine.pojo.OrderDetail;
import com.authine.pojo.OrderMain;
import com.authine.pojo.ProductInfo;
import com.authine.repository.OrderDetailRepository;
import com.authine.repository.OrderMainRepository;
import com.authine.service.OrderService;
import com.authine.service.ProductInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private OrderMainRepository orderMainRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Override
    public Page<OrderDTO> getAll(Pageable pageable) {
        return null;
    }

    @Override
    @Transactional
    public void createOrder(OrderDTO orderDTO) {
        //存入orderDetail 和OrderMain
            BigDecimal tallPrice=new BigDecimal(0);
           for(OrderDetail  item :orderDTO.getOrderList()){
               String id = item.getProductId();
               Optional<ProductInfo> byId = productInfoService.getById(id);
               ProductInfo productInfo = byId.get();
               //判断商品是否存在
               if(productInfo==null){
                   throw new SellException(ExceptionMsg.product_isNot_Exixt);
               }
               //判断商品是否下架
               if(productInfo.getProductState()== ProductState.DOWN.getCode()){
                   throw new SellException(ExceptionMsg.product_isNot_On);
               }
               BigDecimal productPrice = productInfo.getProductPrice();
               Integer quantity = item.getProductQuantity();
               tallPrice=productPrice.multiply(new BigDecimal(quantity)).add(tallPrice);
               BeanUtils.copyProperties(productInfo,item);
               //k扣库存

               if( productInfo.getProductStore()-quantity<0){

                   throw new SellException(ExceptionMsg.product_store_insufficient);
               }
               productInfo.setProductStore(productInfo.getProductStore()-quantity);
               productInfoService.save(productInfo);
           }

           OrderMain orderMain=new OrderMain();
           BeanUtils.copyProperties(orderDTO,orderMain,"orderState","payState");
           orderMain.setOrderAmount(tallPrice);
           OrderMain save = orderMainRepository.save(orderMain);
        for(OrderDetail  item :orderDTO.getOrderList()){
            item.setOrderId(save.getOrderId());
            orderDetailRepository.save(item);
        }
    }

    @Override
    public void modify(String OrderMain) {

    }

    @Override
    public void payOrder() {

    }

    @Override
    public void console(String orderId) {

    }
}
