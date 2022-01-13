package com.cognizant.game.service;

import com.cognizant.game.model.ProgramingGame;
import com.cognizant.game.repository.ProgramingGameRepository;
import com.cognizant.game.util.APITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramingGameService {

    @Autowired
    APITest compileCode;

    @Autowired
    private ProgramingGameRepository programingGameRepository;

    public String saveProgramingGame(ProgramingGame programingGame){

        String result =compileCode.executeScript(programingGame.getScript(),programingGame.getLanguageCode());
        if(result.equalsIgnoreCase("Compilation Fail!!")){
            return result;
        }
        else{
            programingGameRepository.save(programingGame);
            return result;
        }
    }

    public List<Object[]> getTopThreePlayer(){
        List<Object[]> top3Record = programingGameRepository.getTopThreePlayer();
        return top3Record;
    }
}
