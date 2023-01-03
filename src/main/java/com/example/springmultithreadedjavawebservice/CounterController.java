package com.example.springmultithreadedjavawebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    @GetMapping("/counter")
    public void counter(){
        //Create 10 threads
        for (int i = 1; i <= 10; i++){
            Counter counter = new Counter("p" + i);
        }
    }
}
