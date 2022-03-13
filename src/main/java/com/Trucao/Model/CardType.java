package com.Trucao.Model;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CardType {

    private Rank rank;
    private Naipe naipe;

}
