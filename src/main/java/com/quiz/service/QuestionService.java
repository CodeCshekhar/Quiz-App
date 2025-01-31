package com.quiz.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.quiz.dto.QuestionDTO;
import com.quiz.model.Question;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Service
public class QuestionService {

    public List<Question> fetchQuestionsFromJson(String filePath) {
        List<Question> questions = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Parse JSON file into an array of QuestionDTO objects
            QuestionDTO[] questionDTOs = objectMapper.readValue(new File(filePath), QuestionDTO[].class);

            // Map each QuestionDTO to a Question entity
            for (QuestionDTO dto : questionDTOs) {
                Question question = new Question();
                question.setId(dto.getId());
                question.setDescription(dto.getQuestionText());

                // Map options
                question.setOption1(dto.getOption1() != null ? dto.getOption1() : "");
                question.setOption2(dto.getOption2() != null ? dto.getOption2() : "");
                question.setOption3(dto.getOption3() != null ? dto.getOption3() : "");
                question.setOption4(dto.getOption4() != null ? dto.getOption4() : "");

                // Set correct answer
                question.setCorrectAnswer(dto.getCorrectAnswer());

                // Set time limit (if available)
                question.setTimeLimit(dto.getTimeLimit());

                questions.add(question);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return questions;
    }
}