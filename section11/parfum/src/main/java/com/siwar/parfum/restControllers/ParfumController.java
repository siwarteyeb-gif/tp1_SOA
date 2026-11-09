
package com.siwar.parfum.restControllers;

import com.siwar.parfum.config.Configuration;
import com.siwar.parfum.dto.APIResponseDto;
import com.siwar.parfum.service.ParfumService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parfums")
@AllArgsConstructor
public class ParfumController {

    private ParfumService parfumService;
    private Configuration configuration;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getParfumById(
            @PathVariable("id") Long id) {

        return new ResponseEntity<>(
                parfumService.getParfumById(id),
                HttpStatus.OK);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName() + " " + configuration.getEmail());
    }
}
