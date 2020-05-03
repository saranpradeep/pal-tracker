package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final String variableVal;

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String variableVal) {
        this.variableVal = variableVal;
    }

    @GetMapping("/")
    public String sayHello() {
        return this.variableVal;
    }
}