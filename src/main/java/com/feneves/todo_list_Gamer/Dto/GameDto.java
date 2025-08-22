package com.feneves.todo_list_Gamer.Dto;

import com.feneves.todo_list_Gamer.Entitys.Game;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class GameDto {

    private Long id;

    private String title;

    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    private String imgUrl;

    public  GameDto (Game entitys){
        BeanUtils.copyProperties(entitys,this);
    }

}
