package com.sanxia.javaapi.service;

import com.sanxia.javaapi.domain.Electric;
import com.sanxia.javaapi.domain.InnerTempModel;

import java.util.List;

public interface ElectricService {

    List<Electric> queryElectric();

    int insertElectric(Electric electric);

    List<InnerTempModel> queryInnerTemp();
}
