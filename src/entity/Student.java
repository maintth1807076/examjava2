package entity;

public class Student {
    private String enrollId;
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
    }

    public Student(String enrollId, String firstName, String lastName, int age) {
        this.enrollId = enrollId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(String enrollId) {
        this.enrollId = enrollId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
