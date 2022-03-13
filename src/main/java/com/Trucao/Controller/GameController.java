package com.Trucao.Controller;

import com.Trucao.Model.Deck;
import com.Trucao.Model.Rank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController{

    @GetMapping("/cards")
    public Deck getCards(){
        return new Deck();

    }

}
