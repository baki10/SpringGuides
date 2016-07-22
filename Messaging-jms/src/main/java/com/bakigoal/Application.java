package com.bakigoal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.util.FileSystemUtils;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.io.File;

/**
 * Created by ilmir on 21.07.16.
 */
@SpringBootApplication
@EnableJms
public class Application {

  // Strictly speaking this bean is not necessary as boot creates a default
  @Bean
  JmsListenerContainerFactory<?> myJmsContainerFactory(ConnectionFactory connectionFactory) {
    SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
    factory.setConnectionFactory(connectionFactory);
    return factory;
  }

  public static void main(String[] args) throws InterruptedException {
    // Clean out any ActiveMQ data from a previous run
    FileSystemUtils.deleteRecursively(new File("activemq-data"));

    // Launch the application
    ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

    // Send a message
    System.out.println("Writing a message...");
    Thread.sleep(5000);
    MessageCreator messageCreator = new MessageCreator() {
      @Override
      public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage("Hi, This is PINGy!");
      }
    };

    JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
    System.out.println("Sending a new message.");
    jmsTemplate.send(Receiver.DESTINATION, messageCreator);
  }
}