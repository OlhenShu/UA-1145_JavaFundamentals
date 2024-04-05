package homework8;

public class FullName {
    private String fullName;
    private String lastName;

    public FullName(String fullName, String lastName) {
        this.fullName = fullName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
