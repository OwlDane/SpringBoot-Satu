package belajar_spring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import belajar_spring.listener.LoginAgainSuccessListener;
import belajar_spring.listener.LoginSuccessListener;
import belajar_spring.listener.UserListener;
import belajar_spring.service.UserService;

public class EventListenerTest {
    @Configuration
    @Import({
        UserService.class,
        LoginSuccessListener.class,
        LoginAgainSuccessListener.class,
        UserListener.class
    })
    public static class TestConfiguration {
    }
    private ConfigurableApplicationContext applicationContext;
    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }
    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("zidane", "zidane");
        userService.login("zidane", "salah");
        userService.login("abiansyah", "salah");
    }
}
