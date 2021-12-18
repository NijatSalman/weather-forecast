package com.company.weather.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Place {
    @JsonProperty("name")
    private String name;

    @JacksonXmlProperty(localName = "phenomenon")
    private String phenomenon;

    @JsonProperty("tempmin")
    private int tempMin;

    @JsonProperty("tempmax")
    private int tempMax;
}
