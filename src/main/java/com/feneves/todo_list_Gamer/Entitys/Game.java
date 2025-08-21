package com.feneves.todo_list_Gamer.Entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "game_year")
    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    private String imgUrl;

        @Column(columnDefinition = "Text")
    private  String shortDescription;

    @Column(columnDefinition = "Text")
    private  String longDescription;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game gamer = (Game) o;
        return Objects.equals(id, gamer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



}
