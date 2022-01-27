package br.com.zup.zupzeebestart.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface Api {

    @PostMapping("/demo")
    void initDemoWorkflow();

}
