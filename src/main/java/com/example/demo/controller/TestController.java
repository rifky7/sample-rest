package com.example.demo.controller;

import com.example.demo.dto.RequestDTO;
import com.example.demo.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/external/services/rest/sample-service")
    public ResponseEntity<ResponseDTO> sampleService(@RequestBody RequestDTO requestDTO) {
        ResponseDTO.SampleServicers sampleServicers = new ResponseDTO.SampleServicers();
        sampleServicers.setErrorCode("0000");
        sampleServicers.setErrorMsg("Success");
        sampleServicers.setTrxId(requestDTO.getSampleServicerq().getTrxId());
        return ResponseEntity.ok(ResponseDTO.builder().sampleServicers(sampleServicers).build());
    }
}
