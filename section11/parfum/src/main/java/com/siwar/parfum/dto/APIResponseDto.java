package com.siwar.parfum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {

    private ParfumDto parfumDto;

    private MarqueDto marqueDto;
}