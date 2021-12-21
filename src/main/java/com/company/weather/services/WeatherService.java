package com.company.weather.services;

import com.company.weather.domain.model.Forecasts;

public interface WeatherService {

    Forecasts getForecastWeather(String lang);

}
