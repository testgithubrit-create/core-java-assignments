package Assignment4;

import java.util.Map;

public class Question {
  int questionId;

  String question;

  Map<Integer, String> solution;

  public int getQuestionId() {

    return this.questionId;
  }

  public void setQuestionId(int questionId) {

    this.questionId = questionId;
  }

  public String getQuestion() {

    return this.question;
  }

  public void setQuestion(String Question) {

    this.question = this.question;
  }

  public Map<Integer, String> getSolution() {

    return this.solution;
  }

  public void setSolution(Map<Integer, String> solution) {

    this.solution = solution;
  }

  public void display() {

    System.out.println(getQuestionId());
    System.out.println(getQuestion());
    System.out.println(getSolution());
  }
}
