package com.company.weather.model.dto;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
@JsonClassDescription("place")
public class Place {
    @JsonProperty("name")
    private String name;

    //@JsonProperty("phenomenon")
    @JacksonXmlProperty(localName = "phenomenon")
    private String phenomenon;

    @JsonProperty("tempmin")
    private int tempMin;
}
