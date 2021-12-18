package com.company.weather.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    //@JsonProperty("place")
    @JacksonXmlElementWrapper(localName="place")
    private List<Place> placeList;

    //@JsonProperty("wind")
    @JacksonXmlElementWrapper(localName="wind")
    private List<Wind> windList;

    @JsonProperty("sea")
    private String sea;

    @JsonProperty("peipsi")
    private String peipsi;
}
