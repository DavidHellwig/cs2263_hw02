package edu.isu.cs.cs2263;
/**
 * @author David Hellwig
 */

/**
 * this class objects holds course information
 */
public class Course {
    private int number;

    private String subject;

    private String title;

    public Course(){

    }

    /**
     * Getters and setters
     */

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    /**
     *
     * @return full course information
     */
    @Override
    public String toString() {
        return "" + title +
                " " + number + '\'' +
                " '" + subject + '\'';
    }
}
