package com.sanxia.javaapi.service.impl;

import com.sanxia.javaapi.dao.ElectricDao;
import com.sanxia.javaapi.domain.Electric;
import com.sanxia.javaapi.domain.InnerTempModel;
import com.sanxia.javaapi.service.ElectricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectricServiceImpl implements ElectricService {

    @Autowired
    private ElectricDao electricDao;

    @Override
    public List<Electric> queryElectric() {

        return electricDao.queryElectric();
    }

    @Override
    public int insertElectric(Electric electric) {
        int count = electricDao.insertElectric(electric);
        return count;
    }

    @Override
    public List<InnerTempModel> queryInnerTemp() {
        return electricDao.queryInnerTemp();
    }
}
