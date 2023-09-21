package Student;

import Utils.Thesis;
import courseAndConcentrations.Course;

import java.util.List;

public abstract class CourseSelectStrategy {

    protected List<Course> cores;
    protected List<Course> electives;

    public CourseSelectStrategy(List<Course> cores, List<Course> electives) {
        this.cores = cores;
        this.electives = electives;
    }

    public List<Course> getCores() {
        return cores;
    }

    public void setCores(List<Course> cores) {
        this.cores = cores;
    }

    public List<Course> getElectives() {
        return electives;
    }

    public void setElectives(List<Course> electives) {
        this.electives = electives;
    }

    abstract List<Course> selectCoreCourse();
    abstract List<Course> selectElectiveCourse();
    abstract Thesis doThesis();
}
