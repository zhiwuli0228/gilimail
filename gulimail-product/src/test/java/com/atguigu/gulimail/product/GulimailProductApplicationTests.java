package com.atguigu.gulimail.product;

import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("xiaomi");
        boolean save = brandService.save(brandEntity);
        Assertions.assertTrue(save);
    }

}
