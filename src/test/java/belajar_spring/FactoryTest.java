package belajar_spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajar_spring.client.PaymentGatewayClient;

public class FactoryTest {
  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testFactory() {

    PaymentGatewayClient paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);

    Assertions.assertNotNull(paymentGatewayClient);
    Assertions.assertEquals("https://example.com", paymentGatewayClient.getEndpoint());
    Assertions.assertEquals("private", paymentGatewayClient.getPrivateKey());
    Assertions.assertEquals("public", paymentGatewayClient.getPublicKey());

  }
}
