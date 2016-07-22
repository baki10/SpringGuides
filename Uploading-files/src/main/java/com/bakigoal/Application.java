package com.bakigoal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.FileSystemUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by ilmir on 21.07.16.
 */
@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  CommandLineRunner init() {
    return args -> {
      FileSystemUtils.deleteRecursively(new File(FileUploadController.ROOT));
      Files.createDirectory(Paths.get(FileUploadController.ROOT));
    };
  }
}