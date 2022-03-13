package com.Trucao.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Naipe {
    PAUS("p"),
    COPAS("c"),
    ESPADAS("e"),
    OUROS("o");

    private String name;
}
