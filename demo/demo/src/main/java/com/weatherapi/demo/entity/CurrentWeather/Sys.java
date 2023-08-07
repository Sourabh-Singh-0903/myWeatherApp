package com.weatherapi.demo.entity.CurrentWeather;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {
    public String sunrise;
    public String sunset;
    public String country;
    
    

    @Override
    public String toString() {
        return "Sys [sunrise=" + sunrise + ", sunset=" + sunset + ", country=" + country + "]";
    }

    public String getSunrise() {
        long time=Long.parseLong(sunrise);  
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String convertedDate = sdf.format(new java.util.Date(time*1000));
        return convertedDate;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        long time=Long.parseLong(sunset);  
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String convertedDate = sdf.format(new java.util.Date(time*1000));
        return convertedDate;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
