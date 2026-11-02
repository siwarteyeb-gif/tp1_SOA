package com.siwar.marque.restControllers;


import com.siwar.marque.config.Configuration;
import com.siwar.marque.dto.MarqueDto;
import com.siwar.marque.service.MarqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${build.version}")
    private String buildVersion;

    @Autowired
    Configuration configuration;

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName() + " " + configuration.getEmail());
    }

    @GetMapping("/version")
    public ResponseEntity<String> version() {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }

    @GetMapping("{code}")
    public ResponseEntity<MarqueDto> getMarqueByCode(
            @PathVariable("code") String code) {

        return new ResponseEntity<>(
                marqueService.getMarqueByCode(code),
                HttpStatus.OK
        );
    }
}