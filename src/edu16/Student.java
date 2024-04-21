package edu16;

import java.io.Serial;
import java.io.Serializable;

class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    protected static String bachelor;
    private final int id;
    private final String name;
    private final transient String password;

    public Student(String bachelor, int id, String name, String password) {
        Student.bachelor = bachelor;
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return "Fac: " + id + " " + bachelor + ", name: " + name + ", pas: " + password;
    }
}
