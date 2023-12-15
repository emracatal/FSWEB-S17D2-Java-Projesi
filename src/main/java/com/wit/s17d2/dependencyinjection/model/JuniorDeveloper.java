package com.wit.s17d2.dependencyinjection.model;

public class JuniorDeveloper extends Developer{
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary, Experience.JUNIOR);
    }}
