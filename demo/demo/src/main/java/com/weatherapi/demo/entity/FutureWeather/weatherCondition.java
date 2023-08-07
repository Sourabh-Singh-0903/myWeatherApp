package com.weatherapi.demo.entity.FutureWeather;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class weatherCondition {
    ArrayList<basicWeather> list;

    public ArrayList<basicWeather> getList() {
        return list;
    }

    public void setList(ArrayList<basicWeather> list) {
        this.list = list;
    }
}
