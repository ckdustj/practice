package com.practice;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MainService {
    @Autowired
    RestMapper restMapper;

    public String select(int pageNum, int pagePerNum){
        String url = "https://api.odcloud.kr/api/15109950/v1/uddi:1f78fe49-78b4-4784-a5f0-e2c8a60515b4?";
        url += "page=" + pageNum;
        url += "&perPage=" + pagePerNum;
        url += "&serviceKey=hovRue1vzXbdg22h2b6yXGIvhZBbzFaqD4SgZUzdR4pwuwxnP3tL3j7IiMzQT/y9OagRo9Pp4LO7bwWIaCwvpQ==";
        System.out.println(url);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }


    public void insert(List<RestDTO> restDTOS){
        for(RestDTO restDTO : restDTOS) {
            restMapper.insert_store(restDTO);
        }
    }
}
