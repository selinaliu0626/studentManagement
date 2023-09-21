package Student;

import Utils.Message;
import Utils.Person;
import Utils.SchoolTime;
import courseAndConcentrations.Course;
import courseAndConcentrations.CourseGrade;
import management.CourseManagement;
import programs.Program;
import transcript.Transcript;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Student implements Person {
    protected int id;
    protected String name;
    protected Program enrolledProgram;

    protected List<Transcript> transcripts;
    protected List<Course> enrolledCourse;
    protected CourseSelectStrategy strategy;

    protected boolean graduation;
    protected Map<Person,List<Message>> messages;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        enrolledCourse = new ArrayList<>();
        graduation = false;
        messages = new HashMap<>();
    }

    public Student(int id, String name, Program enrolledProgram, CourseSelectStrategy strategy) {
        this.id = id;
        this.name = name;
        this.enrolledProgram = enrolledProgram;
        enrolledCourse = new ArrayList<>();
        this.strategy = strategy;
        graduation = false;
        messages = new HashMap<>();
    }

    public Student(int id, String name, Program enrolledProgram) {
        this.id = id;
        this.name = name;
        this.enrolledProgram = enrolledProgram;
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

    public Program getEnrolledProgram() {
        return enrolledProgram;
    }

    public void setEnrolledProgram(Program enrolledProgram) {
        this.enrolledProgram = enrolledProgram;
    }

    public CourseSelectStrategy getStrategy() {
        return strategy;
    }


    public boolean isGraduation() {
        return graduation;
    }

    public void setGraduation(boolean graduation) {
        this.graduation = graduation;
    }

    public List<Transcript> getTranscripts() {
        return transcripts;
    }

    public void setTranscripts(List<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

    public List<Course> getEnrolledCourse() {

        if(this.enrolledCourse ==null){
            return new ArrayList<>();
        }
        return enrolledCourse;
    }

    public void setEnrolledCourse(List<Course> enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    public void setStrategy(CourseSelectStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean addCourse(Course c){
       if(CourseManagement.getInstance().addStudent(c,this)){
           enrolledCourse.add(c);
           return true;
       }
       return false;
    }
    public boolean removeCourse(Course c){
        if(CourseManagement.getInstance().removeStudent(c,this)){
           enrolledCourse.remove(c);
           return true;
        }
        return false;
    }
    @Override
    public void send(Message m,Person p){

    }
    @Override
    public void receive(Message m,Person p){

    }


}
