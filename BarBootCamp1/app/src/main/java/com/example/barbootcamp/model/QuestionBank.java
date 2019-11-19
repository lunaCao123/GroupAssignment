package com.example.barbootcamp.model;

import com.example.barbootcamp.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class QuestionBank {

    public static Question getQuestionById(int questionID) {
        return questions.get(questionID);
    }

    public static ArrayList<Question> getAllQuestions() {
        return new ArrayList<Question>((List) Arrays.asList(questions.values().toArray()));
    }

    private static final HashMap<Integer, Question> questions = new HashMap<>();

    static {

    }
}
