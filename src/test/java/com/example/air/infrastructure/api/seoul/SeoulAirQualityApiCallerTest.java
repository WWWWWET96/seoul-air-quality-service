package com.example.air.infrastructure.api.seoul;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SeoulAirQualityApiCallerTest {

    @Autowired
    SeoulAirQualityApiCaller seoulAirQualityApiCaller;

    @Test
    public void 서울_대기질_조회_API_호출() {
        // when
        var response = seoulAirQualityApiCaller.getAirQualityInfo();

        // then
        assertNotNull(response);
    }

}