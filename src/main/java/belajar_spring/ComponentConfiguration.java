package belajar_spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajar_spring.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "belajar_spring.service",
    "belajar_spring.repository",
    "belajar_spring.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
    
}   
