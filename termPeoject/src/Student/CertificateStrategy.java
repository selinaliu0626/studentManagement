package Student;

import Utils.Thesis;
import courseAndConcentrations.Course;

import java.util.List;

public class CertificateStrategy extends CourseSelectStrategy{
    public CertificateStrategy(List<Course> cores, List<Course> electives) {
        super(cores, electives);
    }

    @Override
    List<Course> selectCoreCourse() {
        return cores;
    }

    @Override
    List<Course> selectElectiveCourse() {
        return null;
    }

    @Override
    Thesis doThesis() {
        return null;
    }
}
