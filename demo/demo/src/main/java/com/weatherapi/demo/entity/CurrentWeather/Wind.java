package com.weatherapi.demo.entity.CurrentWeather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {
    public int speed;
    public int deg;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getDeg() {
        return deg;
    }
    public void setDeg(int deg) {
        this.deg = deg;
    }
    @Override
    public String toString() {
        return "Wind [speed=" + speed + ", deg=" + deg + "]";
    }
    
}
