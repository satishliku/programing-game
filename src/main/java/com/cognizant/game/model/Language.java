package com.cognizant.game.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long languageId;
    private String language;
    private String languageCode;

}
