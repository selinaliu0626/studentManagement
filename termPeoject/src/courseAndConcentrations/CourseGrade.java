package courseAndConcentrations;

import Student.Student;
import Utils.Grade;

public class CourseGrade {
    Student student;
    Course course;
    Grade grade;

    public CourseGrade(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public  void setGrade(Grade g){
        this.grade = g;
    }
    public Grade getGrade(){
        return this.grade;
    }
}
