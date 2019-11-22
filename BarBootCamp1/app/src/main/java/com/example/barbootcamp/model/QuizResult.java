package com.example.barbootcamp.model;

public class QuizResult {
    private int resultid;
    private String topicId;
    private int quizResult;

    public QuizResult(int resultid, String topicId, int quizResult) {
        this.resultid = resultid;
        this.topicId = topicId;
        this.quizResult = quizResult;
    }

    public int getResultid() {
        return resultid;
    }

    public void setResultid(int resultid) {
        this.resultid = resultid;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public int getQuizResult() {
        return quizResult;
    }

    public void setQuizResult(int quizResult) {
        this.quizResult = quizResult;
    }
}