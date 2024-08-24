package com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.controllers;

import com.acme.platform.hellospringbootdeveloper.generic.domain.model.entities.WelcomeBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping
    public String welcomeDeveloper() {
        return WelcomeBuilder.build(null);
    }

    @GetMapping("{name}")
    public String welcomeDeveloper(@PathVariable String name) {
        return WelcomeBuilder.build(name);
    }
}
