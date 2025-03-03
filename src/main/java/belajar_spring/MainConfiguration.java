package belajar_spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajar_spring.configuration.BarConfiguration;
import belajar_spring.configuration.FooConfiguration;

@Configuration
@Import(value = {
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {

}
