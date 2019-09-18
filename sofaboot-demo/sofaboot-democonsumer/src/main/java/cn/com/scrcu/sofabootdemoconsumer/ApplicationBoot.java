package cn.com.scrcu.sofabootdemoconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationBoot {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationBoot.class);
        ApplicationContext applicationContext = springApplication.run(args);
    }
}
