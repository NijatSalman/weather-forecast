package com.company.weather.model.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;
import java.util.List;

@Data
public class Forecasts {
    @JacksonXmlElementWrapper(localName = "forecast", useWrapping = false)
    private List<Forecast> forecast;
}
