package observation.system.in.beans;

public class Student {

    private Integer id;
    private String firstName;
    private String lastName;

    public Student(String lastName, String firstName, Integer id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
