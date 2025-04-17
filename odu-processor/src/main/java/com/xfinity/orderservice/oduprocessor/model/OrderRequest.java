package com.xfinity.orderservice.oduprocessor.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private String orderId;
    private String customerId;
    private String orderType;
    private String xmlPayload;
}
