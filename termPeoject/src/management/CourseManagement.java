package management;

import Student.Student;
import faculty.ChairPerson;

import courseAndConcentrations.Concentration;
import courseAndConcentrations.Course;
import courseAndConcentrations.SubConcentration;
import courseAndConcentrations.TopLevelConcentration;
import faculty.ChairPerson;

import java.util.*;
//singleton
public class CourseManagement extends Observable {
    private static CourseManagement instance = null;
    private static Map<String, Course> courseMap;
    private static Map<String,Concentration> concentrationMap;



    public CourseManagement() {
        courseMap = new HashMap<>();
        concentrationMap=new HashMap<>();
    }
    public static CourseManagement getInstance() {
        if (instance == null) {
            instance = new CourseManagement();
        }
        return instance;
    }
    public Course setNewCourse(String id,String name,String description){
        Course newCourse = new Course(id,name,description);
        courseMap.put(id,newCourse);
        return newCourse;
    }
    public void remove(Course c){
        courseMap.remove(c.getId());
    }

    public void setNewSubConcentration(String id, String name, String description){
        SubConcentration c = new SubConcentration(id,name,description);
        concentrationMap.put(id,c);
    }
    public void addCourseInSubConcentration(Course c,SubConcentration sub){
        sub.getRelatedCourses().add(c);
    }
    public void setNewTopConcentration(String id, String name, String description){
        TopLevelConcentration con = new TopLevelConcentration(id,name,description);
        concentrationMap.put(id,con);
    }
    public void addSubsIntoTop(TopLevelConcentration top, SubConcentration sub){
        top.getSubConcentrations().add(sub);
    }


    public  boolean addStudent(Course c, Student s){
        if(courseMap.containsKey(c.getId())) {
            if (c.getEnrolledstudents().size() < c.getCapacity()) {
                c.getEnrolledstudents().add(s);
                return true;
            } else {
                c.getWaitlist().add(s);
                System.out.println(s.getName() +" has been added in the waitlist");
                setChanged();
                notifyObservers(c);

                return false;
            }
        }
        return false;

    }
    public void printEnrollInfo(Course c, Student s,boolean b){
        if(b){
            System.out.println("Student: "+s.getName()+" has successfully enrolled in "+ c.getName());
        }else{
            if(ChairPerson.getInstance()!= null){
                ChairPerson.getInstance().update((Observable) CourseManagement.getInstance(),(Object) c);
            }else{
                System.out.println(c.getName()+" reached limitation, but there is no chairPerson to inform");
            }
        }
    }

    public boolean removeStudent(Course c, Student s){
        if(courseMap.containsKey(c.getId())) {
            if (c.getEnrolledstudents().remove(s)) {
                System.out.println(s.getName()+" has been removed from enrolled list");
                if (!c.getWaitlist().isEmpty()) {
                    Student firstWait = c.getWaitlist().remove(0);
                    c.getEnrolledstudents().add(firstWait);
                    firstWait.getEnrolledCourse().add(c);
                    System.out.println(firstWait.getName()+" has been automatically enrolled in "+ c.getName());
                }
                return true;
            }
        }
        return false;
    }
}
