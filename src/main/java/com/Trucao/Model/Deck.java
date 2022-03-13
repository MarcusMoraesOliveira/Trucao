package com.Trucao.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class Deck {

    private final Stack<Card> cartas;

    public Deck(){
        this.cartas = new Stack<>();
        for( Naipe naipe :  Naipe.values()){
            for( Rank rank : Rank.values()){
                CardType tipo_carta = CardType.builder()
                        .naipe(naipe)
                        .rank(rank).build();
                Card carta = Card.builder()
                        .tipo(tipo_carta)
                        .Valor(tipo_carta.getRank().getValue())
                        .build();
                for( Manilhas manilha: Manilhas.values()){
                    System.out.print(carta.getTipo().equals(manilha.getTipo()));
                    System.out.print( " " +carta.getTipo().getRank().toString());
                    System.out.print( " " +manilha.getTipo().getRank().toString());
                    System.out.print( " " +carta.getTipo().getNaipe().toString());
                    System.out.print( " " +manilha.getTipo().getNaipe().toString());
                    System.out.println();

                    if( carta.getTipo().equals(manilha.getTipo())){
                        carta.setValor(manilha.getValor());
                    }
                }
                this.cartas.push(carta);
            }
        }
        System.out.println(this.cartas);
    }
}
