package com.Trucao.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name="room")
public class Room {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Getter
    @Setter
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "room_id")
    @Fetch(value = FetchMode.SELECT)
    @Getter
    private List<Player> jogadores;

    @OneToOne(cascade = CascadeType.ALL)
    @Getter
    @Setter
    private GameRules rules;


    public Room(GameRules rules, String name){
        this.jogadores = new ArrayList<>();
        this.rules = rules;
        this.name = name;
    }

    public Room(String name){
        this(new GameRules(), name);
    }

    public void addPlayer(Player jogador){
        jogadores.add(jogador);
    }

    public void removePlayer(Player jogador){
        jogadores.remove(jogador);
    }
}
