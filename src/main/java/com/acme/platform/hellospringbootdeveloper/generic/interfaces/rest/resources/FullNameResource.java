package com.acme.platform.hellospringbootdeveloper.generic.interfaces.rest.resources;

public record FullNameResource(String firstName, String lastName) {
    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
