package com.example.air.application;

import com.example.air.interfaces.api.dto.AirQualityDto;

public interface KoreaAirQualityService {
    Sido getSido();

    AirQualityDto.GetAirQualityInfo getAirQualityInfo();
}
