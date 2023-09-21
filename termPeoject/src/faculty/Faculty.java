package faculty;

import Student.Student;

import java.util.List;

public abstract class Faculty {
    protected int id;
    protected String name;
    protected String email;

    public Faculty(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getMessage(String message, Student s){
        return  message;
    }
}
