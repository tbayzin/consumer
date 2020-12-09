package com.example.consumer.controller;

import com.example.consumer.model.SehirDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/test")
public class TaskController {

    private static final String  webUrl = "http://localhost:8080/ozgurproject/api";

    @Autowired
    private RestTemplate restTemplate;
    private Object SehirDTO;

    @GetMapping
    public ResponseEntity<SehirDTO>  getSehir() {
       ResponseEntity result = restTemplate.getForEntity(webUrl,ResponseEntity.class);

        System.out.println(result);
       return result ;



}

}
