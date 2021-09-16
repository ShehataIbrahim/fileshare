package com.streams.tools.itrip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.streams.tools.itrip")
public class ITripMailAgetApplication {

    @Autowired
    private MainController controller;


    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ITripMailAgetApplication.class);

        builder.headless(false);

        ConfigurableApplicationContext context = builder.run(args);
        ITripMailAgetApplication application = ((ITripMailAgetApplication) context.getBean(ITripMailAgetApplication.class.getSimpleName()));
        application.getController().init();
    }

    public MainController getController() {
        return controller;
    }

    public void setController(MainController controller) {
        this.controller = controller;
    }
}
