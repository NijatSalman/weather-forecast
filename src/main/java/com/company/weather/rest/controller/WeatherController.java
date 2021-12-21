package com.company.weather.rest.controller;

import com.company.weather.domain.model.Forecasts;
import com.company.weather.services.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        value = "api",
        produces = {"application/json"})
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/forecasts")
    public Forecasts getForecast(
            @RequestParam(required = false, name = "lang") String lang
    ) {
        return weatherService.getForecastWeather(lang);
    }

}
