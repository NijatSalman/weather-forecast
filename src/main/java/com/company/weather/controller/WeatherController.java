package com.company.weather.controller;

import com.company.weather.model.dto.Forecasts;
import com.company.weather.services.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class WeatherController {

        private final WeatherService weatherService;

        @GetMapping("api/forecasts")
        public ResponseEntity<Forecasts> getForecast(@RequestParam(required = false, name = "lang") String lang){
                weatherService.getForecastWeather(lang);
                       return  null;
        }

}
