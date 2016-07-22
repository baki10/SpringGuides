package com.bakigoal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.util.FileSystemUtils;

import java.io.File;

/**
 * Created by ilmir on 22.07.16.
 */
@Component
public class Receiver {

  public static final String DESTINATION = "mailbox-destination";

  /**
   * Get a copy of the application context
   */
  @Autowired
  ConfigurableApplicationContext context;

  /**
   * When you receive a message, print it out, then shut down the application.
   * Finally, clean up any ActiveMQ server stuff.
   */
  @JmsListener(destination = DESTINATION, containerFactory = "myJmsContainerFactory")
  public void receiveMessage(String message) {
    System.out.println("Received <" + message + ">");
    context.close();
    FileSystemUtils.deleteRecursively(new File("activemq-data"));
  }
}
