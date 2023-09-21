package Student;

import Utils.Thesis;
import courseAndConcentrations.Course;

import java.util.List;

public class LastYearStrategy extends CourseSelectStrategy{

    public LastYearStrategy(List<Course> cores, List<Course> electives) {
        super(cores, electives);
    }

    @Override
    public List<Course> selectCoreCourse() {
        return this.cores;
    }

    @Override
    public List<Course> selectElectiveCourse() {
        return this.electives;
    }

    @Override
    public Thesis doThesis() {
        return null;
    }
}
