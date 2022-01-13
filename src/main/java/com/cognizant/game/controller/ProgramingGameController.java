package com.cognizant.game.controller;

import com.cognizant.game.model.Language;
import com.cognizant.game.model.ProgramingGame;
import com.cognizant.game.model.Task;
import com.cognizant.game.service.LanguageService;
import com.cognizant.game.service.ProgramingGameService;
import com.cognizant.game.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramingGameController {

    @Autowired
    private ProgramingGameService programingGameService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private LanguageService languageService;


    @PostMapping("/saveProgram")
    public ResponseEntity<String> saveProgramingGame(@RequestBody ProgramingGame programingGame){
        String result = programingGameService.saveProgramingGame(programingGame);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/saveTask")
    public ResponseEntity saveTask(@RequestBody Task task){
        taskService.saveTask(task);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getTaskList")
    public ResponseEntity<List<Task>> getTaskList(){
        return ResponseEntity.ok(taskService.getTaskList());
    }

    @PostMapping("/saveLanguage")
    public ResponseEntity saveLanguage(@RequestBody Language language){
        languageService.saveLanguage(language);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getLanguages")
    public ResponseEntity<List<Language>> getLanguage(){
        return ResponseEntity.ok(languageService.getLanguages());
    }

    @GetMapping("/getTopThreePlayer")
    public ResponseEntity<List<Object[]>> getTopThreePlayer(){
        return ResponseEntity.ok(programingGameService.getTopThreePlayer());
    }
}
