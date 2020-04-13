package com.gestioncomptes.service.restfulspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class SendMessageToJmsConsumer {

  @Autowired
  private JmsTemplate jmsTemplate;

  
  @PostMapping("/sendmessagejmsconsumer")
  public void send(@RequestBody String message) {
    System.out.println("Sending a message to jms consumer: ." + message);
    // Post message to the message queue named "OrderTransactionQueue"
    jmsTemplate.convertAndSend("ServerSpringtoClientJms", message);
    
  }
}