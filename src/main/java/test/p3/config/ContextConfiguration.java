package test.p3.config;

import org.springframework.context.annotation.Bean;
import test.p3.service.BaseRepository;
import test.p3.service.BaseService;
import test.p3.service.DependentService;

public class ContextConfiguration {
    @Bean
    public BaseRepository baseRepository() { return new BaseRepository(); }

    @Bean
    public BaseService baseService() { return new BaseService(); }

    @Bean
    public DependentService dependent() { return new DependentService(baseRepository(), baseService()); }
}


