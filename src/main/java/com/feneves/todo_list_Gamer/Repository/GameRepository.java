package com.feneves.todo_list_Gamer.Repository;

import com.feneves.todo_list_Gamer.Entitys.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Gamer,Long> {
}
