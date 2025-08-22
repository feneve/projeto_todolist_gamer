package com.feneves.todo_list_Gamer.Service;

import com.feneves.todo_list_Gamer.Dto.GameListDto;
import com.feneves.todo_list_Gamer.Dto.GameMinDto;
import com.feneves.todo_list_Gamer.Entitys.Game;
import com.feneves.todo_list_Gamer.Entitys.GameList;
import com.feneves.todo_list_Gamer.Repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        List<GameList>game = gameListRepository.findAll();
        List<GameListDto> dto = game.stream().map(x-> new GameListDto(x)).toList();
        return  dto;
    }


}
