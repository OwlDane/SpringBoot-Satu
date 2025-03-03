package belajar_spring.event;

import org.springframework.context.ApplicationEvent;
import belajar_spring.data.User;
import lombok.Getter;

public class LoginSuccessEvent extends ApplicationEvent {
    @Getter
    private final User user;

    public LoginSuccessEvent(belajar_spring.data.User user){
        super(user);
        this.user = user;
    }
}
