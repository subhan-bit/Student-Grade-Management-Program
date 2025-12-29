package uk.ac.rhul.cs2800.exception;

/**
 * Exception thrown when a student tries to access a grade for an unregistered module.
 */
public class NoRegistrationException extends Exception {

  private static final long serialVersionUID = 6503724288101118059L;

  /**
   * Constructs a NoRegistrationException with a custom message.
   */
  public NoRegistrationException(String message) {
    super(message);
  }
}