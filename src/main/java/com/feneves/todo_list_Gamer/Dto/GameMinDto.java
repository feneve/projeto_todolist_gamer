package com.feneves.todo_list_Gamer.Dto;

import com.feneves.todo_list_Gamer.Entitys.Game;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameMinDto {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private  String shortDescription;

    public GameMinDto(Game entity) {

        this.id = entity.getId();
        this.shortDescription = entity.getShortDescription();
        this.imgUrl = entity.getImgUrl();
        this.year = entity.getYear();
        this.title= entity.getTitle();

    }
}
