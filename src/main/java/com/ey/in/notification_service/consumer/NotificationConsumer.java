package com.ey.in.notification_service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "txn-notification", groupId = "${spring.kafka.group-id}")
    public void listen(String message) {
        System.out.println("Received Notification Message: " + message);
    }
}
