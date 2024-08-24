package com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.controllers;

import com.acme.platform.hellospringbootdeveloper.generic.domain.model.entities.WelcomeBuilder;
import com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.resources.NamedResource;
import com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.resources.WelcomeResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/named-resources")
public class NamedResourcesController {

    @GetMapping("{name}")
    public NamedResource getNamedResource(@PathVariable String name) {
        return new NamedResource(name);
    }

    @PostMapping
    public WelcomeResponse postNamedResource(@RequestBody NamedResource resource) {
        return new WelcomeResponse(WelcomeBuilder.build(resource.name()));
    }
}
