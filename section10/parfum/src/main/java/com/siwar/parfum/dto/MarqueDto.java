package com.siwar.parfum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarqueDto {

    private Long id;

    private String marqueName;

    private String marqueCode;
}