package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.HashMap;

public class MultipleChoice extends Questions {

    private HashMap<Integer, String> answerChoices;


    public MultipleChoice(String questionAsked, String correctAnswer, int pointValue, HashMap<Integer, String> answerChoices) {
        super(questionAsked, correctAnswer, pointValue);
        this.answerChoices = answerChoices;
    }
}
