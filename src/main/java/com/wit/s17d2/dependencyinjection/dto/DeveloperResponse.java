package com.wit.s17d2.dependencyinjection.dto;

import com.wit.s17d2.dependencyinjection.model.Developer;

public class DeveloperResponse {
    private Developer developer;
    private String message;
    private int status;

    public DeveloperResponse(Developer developer, String message, int status) {
        this.developer = developer;
        this.message = message;
        this.status = status;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }}