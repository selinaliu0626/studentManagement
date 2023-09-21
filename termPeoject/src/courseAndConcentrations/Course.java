package courseAndConcentrations;

import Student.Student;

import java.util.ArrayList;
import java.util.List;

public class Course extends CourseComponent {
    private String syllabus;
    private static final int capacity = 5;
    private static final int credits = 4;
    private List<Student> enrolledstudents;
    private List<Student> waitlist;

    public int getCapacity() {
        return 5;
    }
    public int getCredits() {
        return 4;
    }
    public List<Student> getEnrolledstudents() {
        return enrolledstudents;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }



    public Course(String id, String name, String description){
        super(id, name, description);
        this.enrolledstudents = new ArrayList<Student>();

        this.waitlist = new ArrayList<Student>();
    }
    public Course(String id, String name, String description, String syllabus) {
        super(id, name, description);
        this.syllabus = syllabus;
        this.enrolledstudents = new ArrayList<Student>();
        this.waitlist = new ArrayList<>();
    }



    public List<Student> getWaitlist() {
        return waitlist;
    }

    @Override
    String getTitle() {
        String title =getId()+" "+getName();
        return title;
    }

    @Override
    String getSectionTitle() {
        return "Syllabus";
    }

    @Override
     List<String> getItems() {
        List<String> items = new ArrayList<>();
        items.add(syllabus);
        return items;
    }

}
