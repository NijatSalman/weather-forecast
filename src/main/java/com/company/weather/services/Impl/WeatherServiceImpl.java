package com.company.weather.services.Impl;

import com.company.weather.domain.model.Forecasts;
import com.company.weather.services.WeatherService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${ilmateenistus.weather.api}")
    private String xmlWeatherApi;

    @Autowired
    private RestTemplate restTemplate;

    private ObjectMapper objectMapper;

    @Override
    public Forecasts getForecastWeather(String lang) {
        Forecasts forecasts = restTemplate.getForObject(xmlWeatherApi+"lang="+lang, Forecasts.class);
        return forecasts;
    }
}
