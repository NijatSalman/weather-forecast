package com.company.weather.services;

import com.company.weather.model.dto.Forecasts;

public interface WeatherService {

    Forecasts getForecastWeather(String lang);

}
