package belajar_spring.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerRepository  {

    @Bean
    public CustomerRepository normalCustomerRepository (){
        return new CustomerRepository();
    }

    @Bean
    public CustomerRepository premiumCustomerRepository (){
        return new CustomerRepository();
    }
}
