package test.p4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import test.p4.entities.AmbiguousAutowiredFine;
import test.p4.entities.FineDay;
import test.p4.entities.HeavyFine;

@Configuration
@ComponentScan("test.p4.entities")
public class SpringConfig {
    @Bean
    public FineDay fineDay() {
        return new FineDay();
    }

    @Bean
    public HeavyFine hardFine() {
        return new HeavyFine();
    }

    @Bean
    public AmbiguousAutowiredFine ambiguousAutowiredFine() {
        return new AmbiguousAutowiredFine();
    }
}
