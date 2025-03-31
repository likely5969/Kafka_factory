package com.consumers.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
  
@Service
public class KafkaConsumerService {

	private final List<String> messages = new ArrayList<>();

    @KafkaListener(topics = "test-topic", groupId = "my-shared-group")
    public void consume(String message) {
        messages.add(message);
        System.out.println("Consumed message: " + message);
    }

    public List<String> getMessages() {
        return messages;
    }
}
