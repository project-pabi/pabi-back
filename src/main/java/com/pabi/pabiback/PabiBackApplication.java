package com.pabi.pabiback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class PabiBackApplication {

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(PabiBackApplication.class);
    application.addListeners(new ApplicationPidFileWriter());
    application.run(args);
  }

}
