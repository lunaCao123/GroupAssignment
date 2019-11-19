package com.example.barbootcamp.model;

public class Topic {

    private int topicID;
    private String topicName;
    private String level;
    private String detail1;
    private String detail2;
    private String detail3;
    private int imageDrawableId;
    private String quizName;

    public Topic (int topicID, String topicName, String level, String detail1, String detail2, String detail3, int imageDrawableId, String quizName) {
        this.topicID = topicID;
        this.topicName = topicName;
        this.level = level;
        this.detail1 = detail1;
        this.detail2 = detail2;
        this.detail3 = detail3;
        this.imageDrawableId = imageDrawableId;
        this.quizName = quizName;
    }

    public int getTopicID() { return topicID; }

    public void setTopicID(int topicID) { this.topicID = topicID; }

    public String getTopicName() { return topicName; }

    public void setTopicName(String topicName) { this.topicName = topicName; }

    public String getLevel() { return level; }

    public void setLevel(String level) { this.level = level; }

    public String getDetail1() { return detail1; }

    public void setDetail(String detail1) { this.detail1 = detail1; }

    public String getDetail2() { return detail2; }

    public void setDetail2(String detail2) { this.detail2 = detail2; }

    public String getDetail3() { return detail3; }

    public void setDetail3(String detail3) { this.detail3 = detail3; }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public String getQuizName() { return quizName; }

    public void setQuizName(String quizName) { this.quizName = quizName; }
}
