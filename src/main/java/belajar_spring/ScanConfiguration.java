package belajar_spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "belajar_spring.configuration"
})
public class ScanConfiguration {

}
