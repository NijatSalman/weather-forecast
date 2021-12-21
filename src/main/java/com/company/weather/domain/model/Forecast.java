package com.company.weather.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;


@Data
public class Forecast {

    @JacksonXmlProperty(isAttribute = true)
    private String date;

    @JsonProperty("night")
    private Night night;

    @JsonProperty("day")
    private Day day;
}
