package com.jms.consumer.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {

    public static final String EMPLOYEE_QUEUE = "employee-queue";

    @JmsListener(destination = "test-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }

    @JmsListener(destination = EMPLOYEE_QUEUE)
    public void receiveEmployee(String employee) {
        System.out.println("Received employee: " + employee);
    }
}

