package com.quiz.controller;

import com.quiz.model.Question;
import com.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Allow frontend to access API
@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/fetch")
    public List<Question> fetchQuestions() {
        String filePath = "D:\\IntelliJ\\quiz-app\\src\\questions.json";
        return questionService.fetchQuestionsFromJson(filePath);
    }
}
