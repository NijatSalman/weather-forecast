package com.company.weather.services.Impl;

import com.company.weather.model.dto.Forecasts;
import com.company.weather.services.WeatherService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${ilmateenistus.weather.api}")
    private String xmlWeatherApi;

    @Override
    public Forecasts getForecastWeather(String lang) {
        RestTemplate restTemplate = new RestTemplate();
        XmlMapper xmlMapper = new XmlMapper();
        System.out.println(xmlWeatherApi+"xmlWeatherApi");
        String xmlData = restTemplate.getForObject(xmlWeatherApi, String.class);
        System.out.println(xmlData+"xmlData");
        Forecasts deserializedData;
        try {
//            xmlMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
            xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            deserializedData = xmlMapper.readValue(xmlData, Forecasts.class);
            System.out.println(deserializedData+"deserializedData");
            return deserializedData;
        }catch (Exception exception){
             exception.printStackTrace();
            System.out.println(exception+"exception cause");
             return null;
        }
    }}
