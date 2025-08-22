package com.feneves.todo_list_Gamer.Dto;

import com.feneves.todo_list_Gamer.Entitys.Game;
import com.feneves.todo_list_Gamer.Entitys.GameList;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class GameListDto {

    private String name;

    private Long id;

    public GameListDto(GameList entitys){
        id = entitys.getId();
        name = entitys.getName();
    }
}
