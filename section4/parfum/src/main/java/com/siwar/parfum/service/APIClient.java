        package com.siwar.parfum.service;

import com.siwar.parfum.dto.MarqueDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MARQUE-MICROSERVICE")
public interface APIClient {

    @GetMapping("api/marques/{marque-code}")
    MarqueDto getMarqueByCode(
            @PathVariable("marque-code") String marqueCode
    );
}
