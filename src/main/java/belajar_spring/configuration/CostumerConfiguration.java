package belajar_spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import belajar_spring.repository.CustomerRepository;

@Configuration
public class CostumerConfiguration {

    @Primary
    @Bean
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    }
}
