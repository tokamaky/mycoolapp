package com.JiCode.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public  String getTramInfo(){
        return "Coach: " + coachName + ", Team name: " + teamName;
    }   

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public  String sayHello(){
        return "Hello World";
    }

    //expose a new end point for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    //expose a new end point for "fortune"
    @GetMapping("/fortune")
    public String getDailyfortune() {
        return "Today is a luck day";
    }

}
