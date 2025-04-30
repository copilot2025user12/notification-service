package com.ey.in.notification_service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "txn-notification", groupId = "${spring.kafka.group-id}")
    public void listen(String message) {
        System.out.println("Received Notification Message: " + message);
    }

    //Notification In Progress
    /*private String createEmail(String message) {

        // Create an email message based on the input message

        String[] parts = message.split(",");

        String email = "unknown@example.com";

        String details = "Fraud detected in the transaction processed.";

        for (String part : parts) {

            if (part.startsWith("email=")) {

                email = part.split("=")[1];

            } else if (part.startsWith("details=")) {

                details = part.split("=")[1];

            }

        }

        return "To: " + email + "\nSubject: Fraud Alert\nBody: Fraud detected with the following details: " + details;

    }

// Check if the message contains fraud detection as "yes"

        if (message.contains("fraudDetected=true")) {

        String emailMessage = createEmail(message);

        System.out.println("Fraud detected! Email content: " + emailMessage);

    } else {

        System.out.println("No fraud detected. No email created.");

    }*/

}
