package com.example.demo.config;

import org.springframework.boot.autoconfigure.condition.ResourceCondition;
import org.springframework.stereotype.Component;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        this.packages("com.example.demo.controllers");
    }
}
