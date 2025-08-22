package com.feneves.todo_list_Gamer.Service;

import com.feneves.todo_list_Gamer.Dto.GameDto;
import com.feneves.todo_list_Gamer.Dto.GameMinDto;
import com.feneves.todo_list_Gamer.Entitys.Game;
import com.feneves.todo_list_Gamer.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service

public class GameService {
    @Autowired
    GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        List<Game>game = gameRepository.findAll();
        List<GameMinDto> dto = game.stream().map(x-> new GameMinDto(x)).toList();
        return  dto;
    }


    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Id do gamer não encontrado"));
        return new GameDto(game);
    }
}
