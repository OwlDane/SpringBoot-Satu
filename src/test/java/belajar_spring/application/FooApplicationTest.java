package belajar_spring.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import belajar_spring.data.Foo;

@SpringBootTest(classes = FooApplication.class) 
public class FooApplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testSpringBoot() {
        Assertions.assertNotNull(foo);
    }
}