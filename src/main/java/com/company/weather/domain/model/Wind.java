package com.company.weather.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Wind {
    @JsonProperty("name")
    private String name;

    @JsonProperty("direction")
    private String direction;

    @JsonProperty("speedmin")
    private int speedMin;

    @JsonProperty("speedmax")
    private int speedMax;

    @JsonProperty("gust")
    private String gust;
}
