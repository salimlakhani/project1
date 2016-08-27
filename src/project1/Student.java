package project1;

import java.util.Objects;

/**
 * This is a test class and it will bring joy to the world.
 * 
 * @author Salim Lakhani
 * @version 20160829
 */
public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int age;

    public Student() {
    }
    
    
    /**
     * This is a constructor and it will initialize the fields
     * @param firstName First name of the Student
     * @param lastName Last name of the student
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /**
     * Returns first name of the student
     * @return first name of the student
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", age=" + age + '}';
    }

    
    
}
