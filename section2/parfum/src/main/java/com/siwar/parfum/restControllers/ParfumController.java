
package com.siwar.parfum.restControllers;

import com.siwar.parfum.dto.ParfumDto;
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

    @GetMapping("{id}")
    public ResponseEntity<ParfumDto> getParfumById(
            @PathVariable("id") Long id) {

        return new ResponseEntity<ParfumDto>(
                parfumService.getParfumById(id),
                HttpStatus.OK);
    }
}
