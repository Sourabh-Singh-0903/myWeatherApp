package com.weatherapi.demo.entity.CurrentWeather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    public double temp;
    public int pressure;
    public int humidity;
    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
    public int getPressure() {
        return pressure;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    @Override
    public String toString() {
        return "Main [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + "]";
    }
    
}
