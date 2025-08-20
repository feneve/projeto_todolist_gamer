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
@Table(name = "tb_games")
public class Gamer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "gamer_year")
    private Integer year;

    private String genre;

    private String platform;

    private Double score;

    private String imgUrl;

    private  String shortDescription;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gamer gamer = (Gamer) o;
        return Objects.equals(id, gamer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    private  String longDescription;


}
