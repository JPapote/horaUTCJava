package com.example.test.controller;

import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    TimeController time = new TimeController();

    @RequestMapping("/")
    public String Time() throws JSONException{
        return time.getTime();
    }

}
