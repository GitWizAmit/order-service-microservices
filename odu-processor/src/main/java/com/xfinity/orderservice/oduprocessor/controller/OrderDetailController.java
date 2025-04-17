package com.xfinity.orderservice.oduprocessor.controller;

import com.xfinity.orderservice.oduprocessor.service.OrderQueueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderDetailController {

    private final OrderQueueService orderQueueService;

    /**
     * simulates producer consumer pattern
     * Endpoint to push an order XML to the queue.
     *
     * @param xml the XML string representing the order
     * @return a response indicating success or failure
     */
    @PostMapping("/order/push")
    public ResponseEntity<String> pushOrderToQueue(@RequestBody String xml) {
        try {
            orderQueueService.enqueueXml(xml);
            return ResponseEntity.ok("Order pushed to queue successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error pushing order to queue: " + e.getMessage());
        }
    }
}
