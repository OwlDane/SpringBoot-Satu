package belajar_spring.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import belajar_spring.data.User;
import belajar_spring.event.LoginSuccessEvent;

@Component
public class UserService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
    public boolean login(String username, String password){
    if(isLoginSuccess(username, password)){
        applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
        return true;
    }else{
        return false;
    }
    }

    private boolean isLoginSuccess(String username, String password) {
        return "zidane".equals(username) && "zidane".equals(password);
    }
}
