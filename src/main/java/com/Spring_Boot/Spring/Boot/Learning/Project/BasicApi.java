package com.Spring_Boot.Spring.Boot.Learning.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicApi {
    @GetMapping("")
    String Home(){
        return "Go to the /hey for first api ";
    }

    @GetMapping("/hey")
    String Hey(){
        return "Hello These is First Api";
    }
}
