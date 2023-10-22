package com.meilleurtaux.government.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Commune {

    private String nom;

    @JsonIgnore
    private String code;

    private Integer population;
}
