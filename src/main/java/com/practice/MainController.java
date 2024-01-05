package com.practice;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    MainService mainService;

    @ResponseBody
    @GetMapping("/message")
    public String message(){
        System.out.println("실행댐");
        JSONArray result = mainService.request();
        return result.toString();
    }

    // 요청 URL 예제 : /data/KT/10
    @ResponseBody
    @GetMapping("/data/{tel}/{age}")
    public void get_data(@PathVariable String tel, @PathVariable int age){
        System.out.println(tel);
        System.out.println(age);
    }

    @ResponseBody
    @GetMapping("/data")
    public void get_data2(@RequestParam String tel, @RequestParam int age){
        System.out.println(tel);
        System.out.println(age);
    }

}
