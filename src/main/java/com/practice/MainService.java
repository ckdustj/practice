package com.practice;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MainService {
    private String url = "https://www.daegufood.go.kr/kor/api/tasty.html?mode=json&addr=중구";

    public JSONArray request(){
        RestOperations restOperations = new RestTemplate();
        String result = restOperations.getForObject(url, String.class);
        JSONObject jsonObject = new JSONObject(result);
        return (JSONArray) jsonObject.get("data");
    }
}
