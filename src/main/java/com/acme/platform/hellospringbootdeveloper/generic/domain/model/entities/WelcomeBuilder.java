package com.acme.platform.hellospringbootdeveloper.generic.domain.model.entities;

public class WelcomeBuilder {
    public static String build(String name) {
        return (name == null) ? "Welcome!" : String.format("Welcome %s", name);
    }
}
