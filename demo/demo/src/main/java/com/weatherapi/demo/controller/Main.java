package com.weatherapi.demo.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weatherapi.demo.entity.CurrentWeather.WeatherCondition;
import com.weatherapi.demo.entity.FutureWeather.weatherCondition;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class Main {

    public WeatherCondition getCityWeather(String cityName) throws IOException {
        if (cityName == null) {
            cityName = "delhi";
        }
        URL urlObject = new URL(
                "https://api.openweathermap.org/data/2.5/weather?q=" + cityName
                        + "&appid=316237260af76a9958f8932f794cd1ec&units=metric");
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        if (responseCode == HttpsURLConnection.HTTP_OK) {
            StringBuilder sb = new StringBuilder();
            Scanner scanner = new Scanner(connection.getInputStream());
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
            scanner.close();
            ObjectMapper objectMapper = new ObjectMapper();
            WeatherCondition cityWeatherCondition = objectMapper.readValue(String.valueOf(sb),
                    new TypeReference<WeatherCondition>() {
                    });
            return cityWeatherCondition;

        } else {
            System.out.println("Error in sending get request");
        }
        return null;
    }
    public weatherCondition getCityWeather2(String cityName) throws IOException {
        if (cityName == null) {
            cityName = "delhi";
        }
        URL urlObject = new URL(
                "https://api.openweathermap.org/data/2.5/forecast?q=" + cityName
                        + "&appid=fc9217c2b6f1503ba176dac803dcc755&units=metric");
        HttpsURLConnection connection = (HttpsURLConnection) urlObject.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        if (responseCode == HttpsURLConnection.HTTP_OK) {
            StringBuilder sb = new StringBuilder();
            Scanner scanner = new Scanner(connection.getInputStream());
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
            scanner.close();
            ObjectMapper objectMapper = new ObjectMapper();
            weatherCondition cityWeatherCondition = objectMapper.readValue(String.valueOf(sb),
                    new TypeReference<weatherCondition>() {
                    });
            return cityWeatherCondition;

        } else {
            System.out.println("Error in sending get request");
        }
        return null;
    }

    @GetMapping("/")
    public String homePage(HttpServletRequest request, Model theModel) throws IOException {
        String cityName = request.getParameter("cityName");
        WeatherCondition weatherCondition = getCityWeather(cityName);
        weatherCondition weatherCondition2 = getCityWeather2(cityName);
        if (weatherCondition==null) {
            theModel.addAttribute("cityName", cityName);
            return "errorPage";
        }
        theModel.addAttribute("theDate", new java.util.Date());
        theModel.addAttribute("theWeather", weatherCondition);
        theModel.addAttribute("theWeather2", weatherCondition2);
        return "cityWeather";
    }

}
