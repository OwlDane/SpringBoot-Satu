package belajar_spring.application;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.Banner;

import belajar_spring.data.Foo;
import belajar_spring.listener.AppStartingListener;

@SpringBootApplication
public class FooApplication { 

    @Bean
    public Foo foo() {
        return new Foo();
    }

//  public static void main(String[] args) {
//    ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//
//    Foo foo = applicationContext.getBean(Foo.class);
//    System.out.println(foo);
//  }

//  public static void main(String[] args) {
//    SpringApplication application = new SpringApplication(FooApplication.class);
//    application.setBannerMode(Banner.Mode.OFF);
//    application.setListeners(List.of(new AppStartingListener()));
//
//    ConfigurableApplicationContext applicationContext = application.run(args);
//
//    Foo foo = applicationContext.getBean(Foo.class);
//    System.out.println(foo);
//  }
}