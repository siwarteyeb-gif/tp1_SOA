package com.siwar.marque.service;

import com.siwar.marque.dto.MarqueDto;
import com.siwar.marque.entities.Marque;
import com.siwar.marque.repositories.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarqueServiceImpl implements MarqueService {

    @Autowired
    MarqueRepository marqueRepository;

    @Override
    public MarqueDto getMarqueByCode(String code) {

        Marque marque = marqueRepository.findByMarqueCode(code);

        MarqueDto marqueDto = new MarqueDto(
                marque.getId(),
                marque.getMarqueName(),
                marque.getMarqueCode()
        );

        return marqueDto;
    }
}