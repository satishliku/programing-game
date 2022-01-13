package com.cognizant.game.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum LanguageCode {

    java("java"),CPP("c++"),php("php"),csharp("c#"),c("c");

    @JsonValue
    private final String languageCode;

    LanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }
}
