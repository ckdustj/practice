package com.practice;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private MainService mainService;

    @ResponseBody
    @GetMapping("/index/{pageNum}/{pagePerNum}")
    public String select(@PathVariable int pageNum, @PathVariable int pagePerNum){
        return mainService.select(pageNum, pagePerNum);
    }

    @ResponseBody
    @PostMapping("/insert")
    public void insert(@RequestBody List<RestDTO> restDTOS){
        mainService.insert(restDTOS);
    }

//    // 요청 URL 예제 : /data/KT/10
//    @ResponseBody
//    @GetMapping("/data/{tel}/{age}")
//    public void get_data(@PathVariable String tel, @PathVariable int age){
//        System.out.println(tel);
//        System.out.println(age);
//    }
//
//    @ResponseBody
//    @GetMapping("/data")
//    public void get_data2(@RequestParam String tel, @RequestParam int age){
//        System.out.println(tel);
//        System.out.println(age);
//    }

}
