package com.azadi.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = {"com.azadi.common", "com.azadi.province", "com.azadi.main", "com.azadi.province.db"})
@ConfigurationPropertiesScan(basePackages = {"com.azadi.common", "com.azadi.province", "com.azadi.main", "com.azadi.province.db"})
@EnableJpaRepositories("com.azadi.province.db")
@EntityScan("com.azadi.province.db")
@Slf4j
public class CacheApplication {

    private static String serverPortNumber;

    @Value("${server.port}")
    public void setSvnUrl(String serverPort) {
        serverPortNumber = serverPort;
    }

    public static void main(String[] args) {

        log.info("Application Starting...");

        SpringApplication application = new SpringApplication(CacheApplication.class);
        ConfigurableApplicationContext ctx = application.run(args);
        ctx.registerShutdownHook();
        log.info("Application started on http://localhost:" + serverPortNumber + "/swagger-ui/");
    }

}
