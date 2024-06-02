package com.example.demo.controller;

import com.example.demo.model.ApiRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ApiController {

    @PostMapping("/call-my-it")
    public String receiveRequestFromDemo1(@RequestBody ApiRequest request) {
        log.info("Received payload: taskId={}, supportCorpId={}", request.getTaskId(), request.getSupportCorpId());
        return "CallMyIT has received your request";
    }

}
