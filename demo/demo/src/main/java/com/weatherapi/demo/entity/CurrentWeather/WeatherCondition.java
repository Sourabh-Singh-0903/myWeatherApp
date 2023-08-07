package com.weatherapi.demo.entity.CurrentWeather;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherCondition {
    

    String name;
    String visibility;
    public Main main;
    ArrayList<baicWeather> weather;
    public Wind wind;
    public Sys sys;
    
    
    
    
    public ArrayList<baicWeather> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<baicWeather> weather) {
        this.weather = weather;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WeatherCondition [name=" + name + ", visibility=" + visibility + ", main=" + main + "]";
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

}
