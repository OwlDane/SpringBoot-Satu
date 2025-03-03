package belajar_spring;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import belajar_spring.data.Bar;
import belajar_spring.data.Foo;
import belajar_spring.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("Doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("Doubleton")
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }
}
