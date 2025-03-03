package belajar_spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajar_spring.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {

}
