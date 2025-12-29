package uk.ac.rhul.cs2800.model;

/**
 * Represents a grade with a numeric score.
 */
public class Grade {
  private final Integer score;

  public Grade(Integer score) {
    this.score = score;
  }

  public Integer getScore() {
    return score;
  }
}