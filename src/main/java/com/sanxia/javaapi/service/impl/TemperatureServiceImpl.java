package com.sanxia.javaapi.service.impl;

import com.sanxia.javaapi.dao.TemperatureDao;
import com.sanxia.javaapi.domain.Temperature;
import com.sanxia.javaapi.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemperatureServiceImpl implements TemperatureService {

    @Autowired
    private TemperatureDao temperatureDao;

    @Override
    public int insertTemperature(Temperature temperature) {
        int count = temperatureDao.insertTemperature(temperature);
        return count;
    }
}
