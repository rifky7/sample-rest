package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
public class RequestDTO {

    @JsonProperty("sampleservicerq")
    private SampleServiceRq sampleServicerq;

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class SampleServiceRq {
        private String serviceId;
        private String orderType;
        private String type;
        private String trxId;
    }
}
