package com.feneves.todo_list_Gamer.Entitys;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class BelongPK {

    //classe auxiliar pra classe de pertencimento pois so pode ter um tipo de pk

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongPK belongPK = (BelongPK) o;
        return Objects.equals(game, belongPK.game) && Objects.equals(gameList, belongPK.gameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, gameList);
    }
}
