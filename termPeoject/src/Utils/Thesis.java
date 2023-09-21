package Utils;

import Student.Student;
import faculty.Faculty;

public class Thesis {
    String title;
    Student author;
    Faculty tutor;
    String content;

    public Thesis(String title, Student author) {
        this.title = title;
        this.author = author;
    }

    public Thesis() {
    }
}
