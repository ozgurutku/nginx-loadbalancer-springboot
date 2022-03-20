package com.ozgur.springboot.nginx.loadbalancer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    public int number = 7;

    @GetMapping()
    public String getNumber(){
        return "Number: "+number;
    }

    @PostMapping
    public void setNumber(@RequestParam int number){
        this.number = number;
    }
}
