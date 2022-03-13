package com.Trucao.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "player")
public class Player {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Getter
    private String name;
}
