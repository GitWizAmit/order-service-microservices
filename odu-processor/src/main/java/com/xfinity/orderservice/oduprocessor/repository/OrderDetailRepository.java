package com.xfinity.orderservice.oduprocessor.repository;

import com.xfinity.orderservice.oduprocessor.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
