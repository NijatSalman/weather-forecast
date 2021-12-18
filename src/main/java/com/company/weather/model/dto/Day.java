package com.company.weather.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;
import java.util.List;


@Data
public class Day {
    @JsonProperty("phenomenon")
    private String phenomenon;

    @JsonProperty("tempmin")
    private int tempMin;

    @JsonProperty("tempmax")
    private int tempMax;

    @JsonProperty("text")
    private String text;

    @JacksonXmlElementWrapper(localName = "place", useWrapping = false)
    private List<Place> place;

    @JacksonXmlElementWrapper(localName = "wind", useWrapping = false)
    private List<Wind> wind;

    @JsonProperty("sea")
    private String sea;

    @JsonProperty("peipsi")
    private String peipsi;
}
