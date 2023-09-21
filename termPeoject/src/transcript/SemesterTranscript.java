package transcript;


import Utils.SchoolTime;
import courseAndConcentrations.Course;
import courseAndConcentrations.CourseGrade;

import java.util.ArrayList;
import java.util.List;

public class SemesterTranscript implements Transcript{
   public SchoolTime sc;
    private List<CourseGrade> courseGrades;

    public SemesterTranscript( List<CourseGrade> courses,SchoolTime sc) {
        this.sc = sc;
        this.courseGrades = courses;
    }


// leaf class do not need to do anything about add or remove
    @Override
    public void addTranscript(Transcript transcript) {

    }

    @Override
    public void removeTranscript(Transcript transcript) {

    }

    @Override
    public double getGPA() {
        int totalCredit =0;
        double grades =0;
        for(CourseGrade c : courseGrades){
            double score = c.getGrade().getValue()* c.getCourse().getCredits();
            totalCredit +=c.getCourse().getCredits();
            grades +=score;
        }
        return grades/totalCredit;
    }

    @Override
    public void printTranscript() {
        System.out.println(this.sc.year+","+"Semeter "+this.sc.semester+" Transcript: ");
        for(CourseGrade c: courseGrades){
            System.out.println(c.getCourse().getName()+": "+c.getGrade());
            System.out.println("GPA For this semester is: %,.2f"+this.getGPA());
        }

    }




}
