package faculty;

import courseAndConcentrations.Course;
import management.CourseManagement;

import java.util.Observable;
import java.util.Observer;

public class ChairPerson extends FulltimeFaculty implements Observer {
    private static  ChairPerson chairPerson = null;

    Course teachedCourse;

    public ChairPerson(int id, String name, String email) {
        super(id, name, email);
    }

    public static ChairPerson getInstance() {
        if(chairPerson!= null) return chairPerson;
        return  new ChairPerson(001,"Waton","waton@bu.edu");
    }

    @Override
    public void update(Observable observable, Object o) {
        Course c = (Course) o;
        System.out.println("Course: " + c.getName()+" has reached the limitation and info the chairPerson");
    }
}
