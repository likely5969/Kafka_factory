package com.consumers.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
     
 
@RestController
public class ConsumerController {

    private final KafkaConsumerService consumerService;

    @Autowired
    public ConsumerController(KafkaConsumerService consumerService) {
        this.consumerService = consumerService;
    }


    @GetMapping("/messages")
    public List<String> getMessages() {
        return consumerService.getMessages();
    }
}
