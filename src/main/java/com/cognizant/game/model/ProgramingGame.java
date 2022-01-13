package com.cognizant.game.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_programing_game")
public class ProgramingGame {

    @Id
    @SequenceGenerator(
            name = "programing_game_sequence",
            sequenceName = "programing_game_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "programing_game_sequence"
    )
    private Long programId;
    private String name;
    private String languageCode;
    private String script;

    @ManyToOne()
    @JoinColumn(
            name = "task_id",
            referencedColumnName = "taskId"
    )
    private Task task;
}
