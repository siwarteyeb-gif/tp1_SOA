package com.siwar.marque.service;

import com.siwar.marque.dto.MarqueDto;

public interface MarqueService {

    MarqueDto getMarqueByCode(String code);
}