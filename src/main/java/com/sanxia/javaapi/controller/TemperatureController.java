package com.sanxia.javaapi.controller;

import com.sanxia.javaapi.domain.Temperature;
import com.sanxia.javaapi.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/temperature")
public class TemperatureController {

    @Autowired
    private TemperatureService temperatureService;

    @PostMapping("/insertTemperature")
    @ResponseBody
    public Map<String,Object> insertTemperature(Temperature temperature){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        try{
            int count = temperatureService.insertTemperature(temperature);

            if(count > 0){
                modelMap.put("info","success");
                modelMap.put("code",200);
            }
            return modelMap;
        }catch (Exception e){
            modelMap.put("code",-1);
            modelMap.put("info","failed");
            modelMap.put("error",e.getMessage());
            return modelMap;
        }
    }

}
