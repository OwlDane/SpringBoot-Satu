package belajar_spring.data;

import org.springframework.stereotype.Component;

import belajar_spring.aware.IdAware;
import lombok.Getter;

@Component
public class Car implements IdAware {
    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
