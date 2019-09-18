package cn.com.scrcu.sofabootdemoproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:rpc-sofaboot-starter.xml"})
@SpringBootApplication
public class ProducerApplicationBoot {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ProducerApplicationBoot.class);
        ApplicationContext applicationContext = springApplication.run(args);
    }
}
