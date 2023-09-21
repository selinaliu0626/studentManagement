package programs;

import courseAndConcentrations.Course;

import java.util.ArrayList;
import java.util.List;

public class CertificateProgram implements Program {
    String CertificateConcentration;
    List<Course> requiredCourse;

    public CertificateProgram(String certificateConcentration) {
        CertificateConcentration = certificateConcentration;
        requiredCourse = new ArrayList<>();
    }

    public CertificateProgram(String certificateConcentration, List<Course> requiredCourse) {
        CertificateConcentration = certificateConcentration;
        this.requiredCourse = requiredCourse;
    }

    public String getCertificateConcentration() {
        return CertificateConcentration;
    }

    public void setCertificateConcentration(String certificateConcentration) {
        CertificateConcentration = certificateConcentration;
    }

    public List<Course> getRequiredCourse() {
        return requiredCourse;
    }

    public void setRequiredCourse(List<Course> requiredCourse) {
        this.requiredCourse = requiredCourse;
    }

    @Override
    public void enrolled() {
        System.out.println("enrolled in "+this.CertificateConcentration+"Certificate Program");
    }

    @Override
    public List<Course> getCoreCourses() {
        return requiredCourse;
    }

    @Override
    public List<Course> getEletiveCourses() {
        return null;
    }

    @Override
    public String getThesis() {
        return null;
    }
}
