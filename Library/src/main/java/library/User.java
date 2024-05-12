package library;


public abstract class User {
    //protected поки не міняю))
    private Role role;
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected Operation[] operations;

    public User(Role role, String name, String email, String phoneNumber) {

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    abstract public void menu(DataBase dataBase, User user);

    abstract public String toString();
}
