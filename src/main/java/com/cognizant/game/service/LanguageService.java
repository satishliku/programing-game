package com.cognizant.game.service;

import com.cognizant.game.model.Language;
import com.cognizant.game.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public void saveLanguage(Language language){
        languageRepository.save(language);
    }

    public List<Language> getLanguages(){
        return languageRepository.findAll();
    }
}
