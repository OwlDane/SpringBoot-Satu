package belajar_spring.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import belajar_spring.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoginAgainSuccessListener implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login again for user {}", event.getUser());
    }
}
