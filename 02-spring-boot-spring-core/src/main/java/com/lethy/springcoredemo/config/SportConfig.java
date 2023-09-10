package com.lethy.springcoredemo.config;

import com.lethy.springcoredemo.common.Coach;
import com.lethy.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
