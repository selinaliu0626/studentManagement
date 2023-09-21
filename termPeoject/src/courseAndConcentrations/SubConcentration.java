package courseAndConcentrations;

import faculty.FulltimeFaculty;

import java.util.ArrayList;
import java.util.List;

public class SubConcentration  extends CourseComponent implements Concentration {

    private List<Course> relatedCourses;
    private List<FulltimeFaculty> coordinators;

    public List<Course> getRelatedCourses() {
        return relatedCourses;
    }

    public void setRelatedCourses(List<Course> relatedCourses) {
        this.relatedCourses = relatedCourses;
    }

    public SubConcentration(String id, String name, String description) {
        super(id, name, description);
        relatedCourses= new ArrayList<>();
        coordinators = new ArrayList<>();
    }


    @Override
    public void addCourse(Course course) {
       relatedCourses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        relatedCourses.add(course);
    }

    @Override
    public void setCoordinator(FulltimeFaculty coordinator) {
       coordinators.add(coordinator);
    }

    @Override
    public List<FulltimeFaculty> getCoordinator() {
        return this.coordinators;
    }


    @Override
    String getTitle() {
        return getName();
    }

    @Override
    String getSectionTitle() {
        return "Course";
    }

    @Override
     List<String> getItems() {
        List<String> items = new ArrayList<>();
        for(Course c:relatedCourses){
            items.add(c.format());
        }
        return items;
    }
}
