package belajar_spring.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import belajar_spring.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event){
        log.info("Success login again for user {}", event.getUser());
}

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent2(LoginSuccessEvent event){
        log.info("Success login again for user {}", event.getUser());
}

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent3(LoginSuccessEvent event){
        log.info("Success login again for user {}", event.getUser());
    }
}
