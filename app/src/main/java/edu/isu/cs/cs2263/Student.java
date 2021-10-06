package edu.isu.cs.cs2263;

import java.util.List;

public class Student {
    private String firstName;

    private String lastName;
    private List<Course> studentCourses;

    public Student(List<Course> studentCourses){
        this.studentCourses = studentCourses;

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

    @Override
    public String toString() {
        return "Student{" +
                "" + firstName + '\'' +
                " " + lastName + '\'' +
                '}';
    }
}
