package com.quiz.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OptionDTO {

    private Long id;

    private String description;
    private boolean isCorrect;

    public String getDescription() {
        return description;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
