package com.sanxia.javaapi.dao;

import com.sanxia.javaapi.domain.Electric;
import com.sanxia.javaapi.domain.InnerTempModel;

import java.util.List;

public interface ElectricDao {
    List<Electric> queryElectric();

    int insertElectric(Electric electric);

    List<InnerTempModel> queryInnerTemp();
}
