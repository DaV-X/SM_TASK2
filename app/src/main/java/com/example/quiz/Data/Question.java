package com.example.quiz.Data;
public class Question {
    private int questionId;
    private boolean trueAnswer;
    private int points;
    public Question(int questionId,boolean trueAnswer){
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
    }
    public boolean isTrueAnswer() {
        return trueAnswer;
    }
    public int getQuestionId(){
        return questionId;
    }
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }
}
