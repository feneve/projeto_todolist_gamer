package com.feneves.todo_list_Gamer.Repository;

import com.feneves.todo_list_Gamer.Dto.GameListDto;
import com.feneves.todo_list_Gamer.Entitys.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
