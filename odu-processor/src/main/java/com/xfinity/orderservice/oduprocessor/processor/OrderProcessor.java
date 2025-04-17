package com.xfinity.orderservice.oduprocessor.processor;

import com.xfinity.orderservice.oduprocessor.mapper.XmlToOrderMapper;
import com.xfinity.orderservice.oduprocessor.service.OrderQueueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderProcessor {

    private final OrderQueueService orderQueueService;
    private final XmlToOrderMapper xmlToOrderMapper;

    public OrderProcessor(OrderQueueService orderQueueService, XmlToOrderMapper xmlToOrderMapper) {
        this.orderQueueService = orderQueueService;
        this.xmlToOrderMapper = xmlToOrderMapper;
        startProcessingOrders();
    }

    private void startProcessingOrders() {
    }

    /**
     * This method processes orders from the queue at a fixed delay of 3 seconds.
     * It retrieves orders from the queue and simulates processing them.
     */
    @Scheduled(fixedDelay = 3000)
    public void processOrders() {
        try {
            String xml =
        } catch (Exception e) {
            log.error("Error processing orders", e);
        }
    }

}
