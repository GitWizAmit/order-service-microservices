package com.xfinity.orderservice.oduprocessor.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class OrderQueueService {
    private final BlockingQueue<String> xmlQueue = new LinkedBlockingQueue<>();

    public void enqueueXml(String xml) {
        try {
            xmlQueue.put(xml);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Failed to enqueue XML", e);
        }
    }

    public String dequeueXml() {
        try {
            return xmlQueue.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Failed to dequeue XML", e);
        }
    }

}
