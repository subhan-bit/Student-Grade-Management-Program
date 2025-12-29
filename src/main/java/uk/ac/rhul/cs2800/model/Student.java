package uk.ac.rhul.cs2800.model;

import java.util.ArrayList;
import java.util.List;
import uk.ac.rhul.cs2800.exception.NoGradeAvailableException;

/**
 * Represents a student with personal details and a list of grades.
 */
public class Student {

  private final List<Grade> grades;
  private Long id;
  private String firstName;
  private String lastName;
  private String username;
  private String email;

  /**
   * Full constructor to create a student with complete details.
   */
  public Student(Long id, String firstName, String lastName, String username, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.email = email;
    this.grades = new ArrayList<>();
  }

  /**
   * Default constructor — creates an empty student with no details.
   */
  public Student() {
    this.grades = new ArrayList<>();
  }

  /**
   * Adds a grade to the student's list of grades.
   */
  public void addGrade(Integer score) {
    this.grades.add(new Grade(score));
  }

  /**
   * Returns a copy of the student's grade list to prevent external modification.
   */
  public List<Grade> getGrades() {
    return new ArrayList<>(this.grades);
  }

  /**
   * Computes the average score of all grades.
   */
  public Float computeAverage() throws NoGradeAvailableException {
    if (grades.isEmpty()) {
      throw new NoGradeAvailableException("No grades available");
    }
    float sum = 0;
    for (Grade g : grades) {
      sum += g.getScore();
    }
    return sum / grades.size();
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public Long getId() {
    return id;
  }

}