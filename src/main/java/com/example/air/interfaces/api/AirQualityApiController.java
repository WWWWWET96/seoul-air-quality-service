package com.example.air.interfaces.api;

import com.example.air.application.AirQualityService;
import com.example.air.application.Sido;
import com.example.air.interfaces.api.dto.AirQualityDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/air-quality")
public class AirQualityApiController {
    private final AirQualityService airQualityService;

    @GetMapping("/{sidoCode}")
    public AirQualityDto.GetAirQualityInfo getAirQualityInfo(@PathVariable("sidoCode") Sido sidoCode,
                                                             @RequestParam(value = "gu",required = false) String gu) {
        return airQualityService.getAirQualityInfo(sidoCode, gu);
    }
}
