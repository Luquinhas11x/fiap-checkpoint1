package br.com.fiap.checkpoint1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class Checkpoint1Controller {

    @GetMapping("/ping")
    public String ping() {
        return "Pong";
    }
}
