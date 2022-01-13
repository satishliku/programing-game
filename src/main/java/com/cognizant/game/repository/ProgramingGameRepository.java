package com.cognizant.game.repository;

import com.cognizant.game.model.ProgramingGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramingGameRepository extends JpaRepository<ProgramingGame,Long> {

    @Query(value = "SELECT p.name,p.script,t.task_name " +
            "FROM programing_game.tbl_programing_game p " +
            "join programing_game.task t " +
            "on p.task_id = t.task_id limit 3",nativeQuery = true)
    List<Object[]> getTopThreePlayer();
}
