package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class Checkpoint1Controller {
    @Value("${PROFILE}")
    private String activeProfile;

    @GetMapping("/ping")
    public String ping() {
        return "Pong em " + activeProfile;
    }
}
