package com.sanxia.javaapi.controller;

import com.sanxia.javaapi.domain.Electric;
import com.sanxia.javaapi.domain.InnerTempModel;
import com.sanxia.javaapi.service.ElectricService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/electric")
@CrossOrigin
public class ElectricController {

    @Autowired
    private ElectricService electricService;

    @GetMapping("/getElectric")
    @ResponseBody
    public Map<String,Object> getElectric(){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Electric> electricList = electricService.queryElectric();
        modelMap.put("electricList",electricList);
        return modelMap;
    }

    @PostMapping("/insertElectric")
    @ResponseBody
    public Map<String,Object> insertElectric(Electric electric){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        try{

            int count = electricService.insertElectric(electric);
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


    @GetMapping("/getInnerTemp")
    @ResponseBody
    public Map<String,Object> getInnerTemp(){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<InnerTempModel> innerTempModels = electricService.queryInnerTemp();
        modelMap.put("innerTempList",innerTempModels);
        return modelMap;
    }

}
