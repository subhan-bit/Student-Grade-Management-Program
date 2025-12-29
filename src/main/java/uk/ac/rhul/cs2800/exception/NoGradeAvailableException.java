package uk.ac.rhul.cs2800.exception;

/**
 * Exception thrown when there are no grades available for a student.
 */
public class NoGradeAvailableException extends Exception {

  private static final long serialVersionUID = 7240984316972856421L;

  /**
   * Constructs a NoGradeAvailableException with a custom message.
   */
  public NoGradeAvailableException(String message) {
    super(message);

  }

}