package com.example.barbootcamp.model;

public class Question {
    public int questionID;
    public int topicID;
    public int questionNumber;
    public String question;
    public String answer;
    public String option1;
    public String option2;
    public String option3;
    public String option4;

    public Question (int questionID,
                     int topicID,
                     int questionNumber,
                     String question,
                     String answer,
                     String option1,
                     String option2,
                     String option3,
                     String option4) {
        this.questionID = questionID;
        this.topicID = topicID;
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer = answer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public int getQuestionID() { return questionID; }

    public void setQuestionID(int questionID) { this.questionID = questionID; }

    public int getTopicID() { return topicID; }

    public void setTopicID(int topicID) { this.topicID = topicID; }

    public int getQuestionNumber() {return questionNumber; }

    public void setQuestionNumber(int questionNumber) { this.questionNumber = questionNumber; }

    public String getQuestion() { return question; }

    public void setQuestion(String question) { this.question = question; }

    public String getAnswer() { return answer; }

    public void setAnswer(String answer) { this.answer = answer; }

    public String getOption1() { return option1; }

    public void setOption1(String option1) { this.option1 = option1; }

    public String getOption2() { return option2; }

    public void setOption2(String option2) { this.option2 = option2; }

    public String getOption3() { return option3; }

    public void setOption3(String option3) { this.option3 = option3; }

    public String getOption4() { return option4; }

    public void setOption4(String option4) { this.option4 = option4; }
}


