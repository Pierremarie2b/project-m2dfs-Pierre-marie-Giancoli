package com.project.m2dfs.projectpierre.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballRestController {

    @GetMapping("/result")
    public String myMethod(){
        return "first commit";
    }
}
