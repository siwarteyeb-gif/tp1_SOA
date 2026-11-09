package com.siwar.parfum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParfumDto {

    private Long idParfum;

    private String nomParfum;

    private Double prixParfum;

    private Date dateCreation;

    private String marqueCode;

    private String marqueName;
}