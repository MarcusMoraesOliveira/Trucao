package com.Trucao.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "game_rules")
public class GameRules {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Getter
    @Setter
    private int quantidade_Jogadores;

    public GameRules(){
        this.quantidade_Jogadores = 2;
    }
}
