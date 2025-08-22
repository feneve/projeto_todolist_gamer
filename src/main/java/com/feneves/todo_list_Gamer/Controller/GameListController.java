package com.feneves.todo_list_Gamer.Controller;

import com.feneves.todo_list_Gamer.Dto.GameListDto;
import com.feneves.todo_list_Gamer.Dto.GameMinDto;
import com.feneves.todo_list_Gamer.Service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result =gameListService.findAll();
        return result;
    }
}
