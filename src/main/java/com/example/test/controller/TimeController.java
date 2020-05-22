package com.example.test.controller;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.TimeZone;


@Service
public class TimeController {



    public String getTime() throws JSONException {

        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
         Object hora = sdf.format(new Date());


        JSONObject obd = new JSONObject();
        obd.put("Zone", "utc");
        obd.put("Time", hora);


        return obd.toString();
    }
}
