package com.siwar.parfum.service;

import com.siwar.parfum.dto.APIResponseDto;
import com.siwar.parfum.dto.MarqueDto;
import com.siwar.parfum.dto.ParfumDto;
import com.siwar.parfum.entities.Parfum;
import com.siwar.parfum.repositories.ParfumRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ParfumServiceImpl implements ParfumService {

    private ParfumRepository parfumRepository;

    private APIClient apiClient;

    @Override
    public APIResponseDto getParfumById(Long id) {

        Parfum parfum = parfumRepository.findById(id).get();

        MarqueDto marqueDto =
                apiClient.getMarqueByCode(parfum.getMarqueCode());

        ParfumDto parfumDto = new ParfumDto(
                parfum.getIdParfum(),
                parfum.getNomParfum(),
                parfum.getPrixParfum(),
                parfum.getDateCreation(),
                parfum.getMarqueCode(),
                marqueDto.getMarqueName()
        );

        APIResponseDto apiResponseDto = new APIResponseDto();

        apiResponseDto.setParfumDto(parfumDto);
        apiResponseDto.setMarqueDto(marqueDto);

        return apiResponseDto;
    }
}