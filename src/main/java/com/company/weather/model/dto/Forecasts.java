package com.company.weather.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
public class Forecasts {
    @JacksonXmlElementWrapper(localName="forecast")
    private List<Forecast> forecast;
}
