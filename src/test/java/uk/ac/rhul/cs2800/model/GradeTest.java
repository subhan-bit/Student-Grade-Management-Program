package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the Grade class.
 */
public class GradeTest {

  // Test 1
  @Test
  void testGradeScore() {
    Grade grade = new Grade(35);
    assertEquals(35, grade.getScore());
  }

  // Test 2
  @Test
  void testGradesWithTwoScores() {
    Grade grade1 = new Grade(90);
    Grade grade2 = new Grade(45);
    assertNotEquals(grade1.getScore(), grade2.getScore());
  }

  // Test 3
  @Test
  void testGradeWithNoScore() {
    Grade grade = new Grade(null);
    assertNull(grade.getScore());
  }

}