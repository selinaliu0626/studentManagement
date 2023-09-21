package programs;

import courseAndConcentrations.Course;

import java.util.List;

public interface Program {
    void enrolled();
    public List<Course> getCoreCourses();
    public List<Course> getEletiveCourses();
    public String getThesis();
}
