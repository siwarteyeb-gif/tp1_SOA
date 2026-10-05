        package com.siwar.parfum.service;

import com.siwar.parfum.dto.ParfumDto;
import com.siwar.parfum.entities.Parfum;
import com.siwar.parfum.repositories.ParfumRepository;
import com.siwar.parfum.service.ParfumService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ParfumServiceImpl implements ParfumService {

    private ParfumRepository parfumRepository;

    @Override
    public ParfumDto getParfumById(Long id) {

        Parfum parfum = parfumRepository.findById(id).get();

        return new ParfumDto(
                parfum.getIdParfum(),
                parfum.getNomParfum(),
                parfum.getPrixParfum(),
                parfum.getDateCreation(),
                parfum.getMarqueCode()
        );
    }
}
