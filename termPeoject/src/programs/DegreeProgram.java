package programs;

import Student.Student;
import Utils.Major;
import courseAndConcentrations.Course;

import java.util.ArrayList;
import java.util.List;

public class DegreeProgram implements Program{
    protected Major major;
    protected String thesisRequirements;
    protected List<Course> coreCourses;
    protected List<Course> electiveCourses;

    public DegreeProgram(Major major, String thesisRequirements) {
        this.major = major;
        this.thesisRequirements = thesisRequirements;
        coreCourses = new ArrayList<>();
        electiveCourses = new ArrayList<>();
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String getThesisRequirements() {
        return thesisRequirements;
    }

    public void setThesisRequirements(String thesisRequirements) {
        this.thesisRequirements = thesisRequirements;
    }

    public List<Course> getCoreCourses() {
        return coreCourses;
    }

    @Override
    public List<Course> getEletiveCourses() {
        return electiveCourses;
    }

    @Override
    public String getThesis() {
        return thesisRequirements;
    }

    public void setCoreCourses(List<Course> coreCourses) {
        this.coreCourses = coreCourses;
    }

    public List<Course> getElectiveCourses() {
        return electiveCourses;
    }

    public void setElectiveCourses(List<Course> electiveCourses) {
        this.electiveCourses = electiveCourses;
    }

    @Override
    public void enrolled() {

    }
}
