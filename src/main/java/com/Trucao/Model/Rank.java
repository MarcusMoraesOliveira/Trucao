package com.Trucao.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Rank {

    AS("AS", 8),
    DOIS("2", 9),
    TRES("3",10),
    QUATRO("4",1),
    CINCO("5",2),
    SEIS("6", 3),
    SETE("7", 4),
    VALETE("Valete", 5),
    DAMA("Dama",6),
    REI("Rei", 7);

    private String name;
    private int value;
}
