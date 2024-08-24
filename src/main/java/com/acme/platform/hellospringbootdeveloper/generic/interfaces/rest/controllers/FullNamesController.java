package com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.controllers;

import com.acme.platform.hellospringbootdeveloper.generic.domain.model.entities.WelcomeBuilder;
import com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.resources.FullNameResource;
import com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.resources.WelcomeResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/full-names")
public class FullNamesController {

    @PostMapping
    public WelcomeResponse postFullName(@RequestBody FullNameResource resource) {
        return new WelcomeResponse(WelcomeBuilder.build(resource.fullName()));
    }
}
