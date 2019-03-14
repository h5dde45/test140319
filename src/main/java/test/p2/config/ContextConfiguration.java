package test.p2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
@ComponentScan("test.p2.service")
public class ContextConfiguration {
    @Bean
    public Random random() {
        return new Random();
    }
}
