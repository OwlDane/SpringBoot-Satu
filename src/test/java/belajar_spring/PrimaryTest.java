package belajar_spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import belajar_spring.data.Foo;

public class PrimaryTest {
    private ApplicationContext applicationcontext;

    @BeforeEach
    void setUp(){
        applicationcontext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);

    }

    @Test
    void testGetPrimary(){
        Foo foo = applicationcontext.getBean(Foo.class);
        Foo foo1 = applicationcontext.getBean("foo1", Foo.class);
        Foo foo2 = applicationcontext.getBean("foo2", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
        Assertions.assertNotSame(foo1, foo2);
    }
}
