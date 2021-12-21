package com.company.weather.domain.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;
import java.util.List;

@Data
public class Forecasts {
    @JacksonXmlElementWrapper(localName = "forecast", useWrapping = false)
    private List<Forecast> forecast;
}
