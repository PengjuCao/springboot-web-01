package com.cpj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWeb01ApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("获取时间"+new Date());
    }

}
