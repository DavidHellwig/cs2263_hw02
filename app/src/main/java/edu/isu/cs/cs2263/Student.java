package edu.isu.cs.cs2263;

import java.util.List;

public class Student {
    private String firstName;

    private String lastName;
    private List<Course> studentCourses;

    List<Course> course;

    public Student(){


    }

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
        return course;
    }

    public void setCourses(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "" + firstName + '\'' +
                " " + lastName + '\'' +
                '}';
    }
}
