package com.example.springboot.service.factory.city;

import com.example.springboot.enums.SimpleEnum;
import com.example.springboot.model.DO.CityDO;
import com.example.springboot.persist.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lingjun.jlj
 * @data 2018/4/28
 * @Description:
 */
@Service
public class CityAServiceProcessorImpl implements CityProcessor{
    @Autowired
    private CityMapper cityMapper;

    @Override
    public Integer getTag() {
        return SimpleEnum.A.getCode();
    }

    @Override
    public CityDO process() {
        return cityMapper.selectById(1L);
    }
}