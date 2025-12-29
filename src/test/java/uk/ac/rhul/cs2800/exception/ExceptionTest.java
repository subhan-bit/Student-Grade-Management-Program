package uk.ac.rhul.cs2800.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for custom exceptions.
 */
public class ExceptionTest {

  // Test 1
  @Test
  void testNoGradeAvailableExceptionMessage() {
    NoGradeAvailableException e = new NoGradeAvailableException("No grades");
    assertNotNull(e);
    assertEquals("No grades", e.getMessage());
  }

  // Test 2
  @Test
  void testNoRegistrationExceptionMessage() {
    NoRegistrationException e = new NoRegistrationException("No registration");
    assertNotNull(e);
    assertEquals("No registration", e.getMessage());
  }
}

