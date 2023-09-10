package com.lethy.springcoredemo.rest;

import com.lethy.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;

    @Autowired
    DemoController(@Qualifier("cricketCoach") Coach myCoach) {
        this.coach = myCoach;
    }

    @GetMapping("/dailyworkout")
    String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
