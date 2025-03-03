package belajar_spring;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

import belajar_spring.data.Bar;
import belajar_spring.data.Foo;
import belajar_spring.data.FooBar;
import belajar_spring.data.MultiFoo;

@Configuration
@Import(value = MultiFoo.class)
public class OptionalConfiguration {

    @Bean
    @Primary
    public Foo foo(){
        return new Foo();
  }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
        return new FooBar(foo.orElse(null), bar.orElse(null));
  }
}
