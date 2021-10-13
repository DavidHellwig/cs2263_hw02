package edu.isu.cs.cs2263;
/**
 * @author David Hellwig
 */
import java.util.List;

/**
 * this class object holds student names, and a list of courses
 */
public class Student {
    private String firstName;

    private String lastName;


    List<Course> courses;

    public Student(){


    }

    /**
     * Getters and setters
     */

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> course) {
        this.courses = course;
    }

    /**
     *
     * @return Returns full student name
     */
    @Override
    public String toString() {
        return firstName + '\'' +
                " " + lastName + '\'';
    }
}
