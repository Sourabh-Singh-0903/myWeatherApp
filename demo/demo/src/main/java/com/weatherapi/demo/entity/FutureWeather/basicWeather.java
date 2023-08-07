package com.weatherapi.demo.entity.FutureWeather;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class basicWeather {
    public Main main;
    // public Rain rain;
    public Wind wind;
    public String dt;
    public String getDt() {
        long time=Long.parseLong(dt);  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String convertedDate = sdf.format(new java.util.Date(time*1000));
        return convertedDate;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    ArrayList<WeatherDescription> weather;
    public ArrayList<WeatherDescription> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<WeatherDescription> weather) {
        this.weather = weather;
    }

    
    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
