package com.greatlearning.great_amazon_website.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@Controller + @ResponseBody
public class HomeController {


    @GetMapping("/home")
    public // If I used controller Id put @ResponseBody here
    String welcome(){
        return "Hi, Welcome to the video!;";
    }
}
