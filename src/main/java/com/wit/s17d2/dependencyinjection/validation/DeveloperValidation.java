package com.wit.s17d2.dependencyinjection.validation;

import com.wit.s17d2.dependencyinjection.model.Developer;

import java.util.Map;

public class DeveloperValidation {

    public static boolean isDeveloperExist(Map<Integer, Developer> developers, int id){
        return developers.containsKey(id);
    }

}