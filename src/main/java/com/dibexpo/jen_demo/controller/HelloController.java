package com.dibexpo.jen_demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helllo")
    public void printMessage(){
        System.out.println("***********************************************");
        System.out.println("****************** Hello World  ***************");
        System.out.println("****************** This is the  ***************");
        System.out.println("****************** CI / CD DEMO ***************");
        System.out.println("****************** IT'S WORKING ***************");
        System.out.println("****************** YEAHHHHHHHHH  ***************");
        System.out.println("***********************************************");

    }
}
