package com.example.android.finalproject_christinakasey.Cards;

public class QuestionHolder {
    private Question questions[];

    public QuestionHolder() {
        questions=Question.getRandomQuestions();
    }

    public Question[] getQuestions() {
        return questions;
    }
    public void setAnswersToQuestions (String answersToQuestions[]){
        for(int i =0 ; i< answersToQuestions.length; ++i){
            String answer=answersToQuestions[i];
            Question question = questions[i];
            question.setAnswer(answer);
        }
    }
}