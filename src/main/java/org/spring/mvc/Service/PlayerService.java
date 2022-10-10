package org.spring.mvc.Service;

import org.spring.mvc.Model.Player;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {
    private List<Player> players= Arrays.asList(
            new Player(1,"Rahul",23,"Indian"),
            new Player(2,"Kalyan",26,"Asian"),
            new Player(3,"Rohit",25,"USA"),
            new Player(4,"Apoorva",25,"Nepal")
    );

    public Player getPlayerByName(String name){
        return players.stream().filter(p->p.getName().equals(name)).findFirst().get();
    }
    public Player getPlayerById(int id){
        return players.stream().filter(p -> p.getId() == id).findFirst().get();
    }

}