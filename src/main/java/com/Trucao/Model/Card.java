package com.Trucao.Model;

import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Card {

    public CardType tipo;
    private int Valor;

}
