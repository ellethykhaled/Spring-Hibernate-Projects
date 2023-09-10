package com.lethy.springcoredemo.rest;

import com.lethy.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    DemoController(@Qualifier("cricketCoach") Coach coach,
                   @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyworkout")
    String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    String check() {
        return "Comparing beans: coach == another coach = " + (coach == anotherCoach);
    }
}
