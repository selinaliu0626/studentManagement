package courseAndConcentrations;
//composite pattern

import faculty.FulltimeFaculty;

import java.util.List;
//use composite pattern
public interface Concentration {
    void addCourse(Course course);
    void removeCourse(Course course);
    void setCoordinator(FulltimeFaculty coordinator);
    List<FulltimeFaculty> getCoordinator();

}
