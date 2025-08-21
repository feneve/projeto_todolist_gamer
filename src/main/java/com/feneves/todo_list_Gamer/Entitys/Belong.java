package com.feneves.todo_list_Gamer.Entitys;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Table(name = "tb_belong")
@Data
@NoArgsConstructor
public class Belong {

    @EmbeddedId
    private BelongPK id = new BelongPK();

    private Integer posicion;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belong belong = (Belong) o;
        return Objects.equals(id, belong.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Belong (Game game, GameList gameList, Integer posicion){

        this.posicion = posicion;
        id.setGame(game);
        id.setGameList(gameList);

    }
}
