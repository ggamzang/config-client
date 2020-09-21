package com.example.configclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigclientApplicationTests {

    @Value("${my.value}")
    private String myVal;

    @Test
    void contextLoads() {
        System.out.println("my.value : " + myVal);
    }

}
