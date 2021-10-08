package edu.isu.cs.cs2263;

import java.util.List;

public class Student {
    private String firstName;

    private String lastName;
    private List<Course> studentCourses;

    List<Course> courses;

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
        return courses;
    }

    public void setCourses(List<Course> course) {
        this.courses = course;
    }


    @Override
    public String toString() {
        return "Student{" +
                "" + firstName + '\'' +
                " " + lastName + '\'' +
                '}';
    }
}
