package com.xfinity.orderservice.oduprocessor.service;

import com.xfinity.orderservice.oduprocessor.model.OrderDetail;
import com.xfinity.orderservice.oduprocessor.repository.OrderDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    public OrderDetail saveOrderDetail(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
        return orderDetail;
    }

    public OrderDetail getOrderDetail(Long id) {
        Optional<OrderDetail> orderDetailOptional = orderDetailRepository.findById(id);
        return orderDetailOptional.orElse(null);
    }
}
