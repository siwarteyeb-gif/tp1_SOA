package com.siwar.parfum.service;

import com.siwar.parfum.dto.MarqueDto;
import org.springframework.stereotype.Component;

@Component
public class MarqueFallback implements APIClient {

    @Override
    public MarqueDto getMarqueByCode(String marqueCode) {
        return null;
    }
}