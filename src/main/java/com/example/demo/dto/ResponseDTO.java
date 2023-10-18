package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDTO {
    @JsonProperty("sampleservicers")
    private SampleServicers sampleServicers;

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class SampleServicers {
        private String errorCode;
        private String errorMsg;
        private String trxId;
    }
}
