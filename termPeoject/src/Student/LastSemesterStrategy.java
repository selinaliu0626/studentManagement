package Student;

import Utils.Thesis;
import courseAndConcentrations.Course;

import java.util.List;

public class LastSemesterStrategy extends CourseSelectStrategy{
    public LastSemesterStrategy(List<Course> cores, List<Course> electives) {
        super(cores, electives);
    }

    @Override
    List<Course> selectCoreCourse() {
        return this.cores;
    }

    @Override
    List<Course> selectElectiveCourse() {
        return this.electives;
    }

    @Override
    Thesis doThesis() {
        return new Thesis();
    }
}
