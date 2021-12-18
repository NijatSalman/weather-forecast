package com.company.weather.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Forecast {
    //@JsonProperty("date")
    @JacksonXmlProperty(localName = "date")
    private Date date;

    //@JsonProperty("night")
    @JacksonXmlProperty(localName = "night")
    private Night night;

    //@JsonProperty("day")
    @JacksonXmlProperty(localName = "day")
    private Day day;
}
