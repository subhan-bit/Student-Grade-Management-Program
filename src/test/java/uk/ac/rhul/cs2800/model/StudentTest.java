package uk.ac.rhul.cs2800.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;
import uk.ac.rhul.cs2800.exception.NoRegistrationException;


/**
 * Unit tests for the Student class.
 */
public class StudentTest {

  // Test 1
  @Test
  void addGradeTest() {
    Student student = new Student();
    student.addGrade(5);
    assertEquals(1, student.getGrades().size());
    assertEquals(5, student.getGrades().get(0).getScore());
  }

  // Test 2
  @Test
  void computeAverageWithMultipleGrades() throws NoGradeAvailableException , NoRegistrationException {
    Student student = new Student();
    student.addGrade(10);
    student.addGrade(20);
    student.addGrade(30);
    assertEquals(20.0f, student.computeAverage());
  }

  // Test 3
  @Test
  void computeAverageThrowsExceptionWhenNoGrades() {
    Student student = new Student();
    assertThrows(NoGradeAvailableException.class, student::computeAverage);
  }

  // Test 4
  @Test
  void computeAverageSingleGradeTest() throws NoGradeAvailableException, NoRegistrationException {
    Student student = new Student();
    student.addGrade(42);
    assertEquals(42.0f, student.computeAverage());
  }

  // Test 5
  @Test
  void computeAverageWithFloatResult() throws NoGradeAvailableException , NoRegistrationException {
    Student student = new Student();
    student.addGrade(1);
    student.addGrade(2);
    assertEquals(1.5f, student.computeAverage());
  }

  // Test 6
  @Test
  void testFullConstructorAndGetters() {
    Student student = new Student(1L, "Subhan", "Ahmad", "wnis062", "wnis062@live.rhul.ac.uk");
    assertEquals(1L, student.getId());
    assertEquals("Subhan", student.getFirstName());
    assertEquals("Ahmad", student.getLastName());
    assertEquals("wnis062", student.getUsername());
    assertEquals("wnis062@live.rhul.ac.uk", student.getEmail());
  }

}