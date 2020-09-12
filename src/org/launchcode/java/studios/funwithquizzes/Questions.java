package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Questions {

    protected String questionAsked;
    private String correctAnswer;
    private ArrayList<String> answerOptions;
    private int pointValue;

    public Questions(String questionAsked, String correctAnswer, int pointValue) {
        this.questionAsked = questionAsked;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    public String getQuestionAsked() {
        return questionAsked;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isCorrect(String correctAnswer, String userAnswer) {
        if (correctAnswer == userAnswer) {
            return true;
        } else {
            return false;
        }
    }

    public String displayQuestionAskedAndAnswerChoices() {
        String display = "";
        return display;
    }
}
