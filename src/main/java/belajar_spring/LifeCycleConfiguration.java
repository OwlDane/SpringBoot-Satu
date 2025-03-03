package belajar_spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import belajar_spring.data.Connection;
import belajar_spring.data.Server;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection  connection(){
        return new Connection();
    }

    //@Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server (){
        return new Server();
    }
}
