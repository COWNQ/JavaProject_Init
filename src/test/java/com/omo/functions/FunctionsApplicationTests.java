package com.omo.functions;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.omo.functions.domain.File;
import com.omo.functions.mapper.FileMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FunctionsApplicationTests {

    @Autowired
    private FileMapper fileMapper;

    @Test
    void contextLoads() {
        QueryWrapper<File> wrapper = new QueryWrapper<>();
        Long l = fileMapper.selectCount(wrapper);
        System.out.println(l);
    }

}
