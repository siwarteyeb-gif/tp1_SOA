package com.siwar.marque.restControllers;

import com.siwar.marque.dto.MarqueDto;
import com.siwar.marque.service.MarqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marques")
@RequiredArgsConstructor
public class MarqueController {

    private final MarqueService marqueService;

    @GetMapping("{code}")
    public ResponseEntity<MarqueDto> getMarqueByCode(
            @PathVariable("code") String code) {

        return new ResponseEntity<>(
                marqueService.getMarqueByCode(code),
                HttpStatus.OK
        );
    }
}
