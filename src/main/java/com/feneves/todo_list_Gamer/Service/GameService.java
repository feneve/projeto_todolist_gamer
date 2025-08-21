package com.feneves.todo_list_Gamer.Service;

import com.feneves.todo_list_Gamer.Dto.GameMinDto;
import com.feneves.todo_list_Gamer.Entitys.Game;
import com.feneves.todo_list_Gamer.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service

public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<GameMinDto> findAll(){
        List<Game>game = gameRepository.findAll();
        List<GameMinDto> dto = game.stream().map(x-> new GameMinDto(x)).toList();
        return  dto;
    }
}
