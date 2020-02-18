package com.xyinc.gps;

import com.xyinc.gps.model.Pois;
import com.xyinc.gps.repository.PoisRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRepository {
    @Autowired
    PoisRepository poisRepository;

    @Test
    public void getAddPoiTest() {
        Pois p = new Pois();
        p.setName("Igreja");
        p.setCooX1(20);
        p.setCooY1(10);
        poisRepository.save(p);
    }

    @Test
    public void getAllPoisTest() {
        poisRepository.findAll();
    }

    @Test
    public void getUnderTenTest() {
        Integer cooX2 = 20, cooY2 = 30;
        poisRepository.findByCoo(cooX2, cooY2);
    }

}

