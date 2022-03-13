package com.Trucao.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.Trucao.Model.Naipe.*;
import static com.Trucao.Model.Rank.*;

@Getter
@AllArgsConstructor
public enum Manilhas {

    ZAP(CardType.builder().naipe(PAUS).rank(QUATRO).build(),40),
    SETE_DE_COPAS(CardType.builder().naipe(COPAS).rank(SETE).build(),39),
    ESPADILHA(CardType.builder().naipe(ESPADAS).rank(AS).build(), 38),
    SETE_DE_OUROS(CardType.builder().naipe(OUROS).rank(SETE).build(), 37);

    private CardType tipo;
    private int valor;

}
