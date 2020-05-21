package com.example.test.controller;

import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.TimeZone;

@Service
public class TimeController {


    public  String getTime() {
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        final String utcTime = sdf.format(new Date());

        return utcTime;
    }
}
