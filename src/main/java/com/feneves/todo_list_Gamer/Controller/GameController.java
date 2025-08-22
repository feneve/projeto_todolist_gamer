package com.feneves.todo_list_Gamer.Controller;

import com.feneves.todo_list_Gamer.Dto.GameDto;
import com.feneves.todo_list_Gamer.Dto.GameMinDto;
import com.feneves.todo_list_Gamer.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    GameService gameService;


    @GetMapping
    public List<GameMinDto> findAll(){
    List<GameMinDto> result =gameService.findAll();
    return result;
    }

    @GetMapping("/{id}")
    public GameDto findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
