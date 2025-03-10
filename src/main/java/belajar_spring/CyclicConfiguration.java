package belajar_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import belajar_spring.data.cyclic.CyclicA;
import belajar_spring.data.cyclic.CyclicB;
import belajar_spring.data.cyclic.CyclicC;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC (CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
