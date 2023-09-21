package transcript;



import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class YearlyTranscript implements Transcript{
    Year academicYear;
   private List<Transcript> semesterTranscripts;

    public YearlyTranscript(Year academicYear){
        this.academicYear =academicYear;
        this.semesterTranscripts =new ArrayList<>();
    }


    @Override
    public void addTranscript(Transcript transcript) {
        semesterTranscripts.add(transcript);
    }

    @Override
    public void removeTranscript(Transcript transcript) {
        semesterTranscripts.remove(transcript);

    }

    @Override
    public double getGPA() {
        double totalGpa = 0.0;
        for(Transcript t:semesterTranscripts){
            totalGpa +=t.getGPA();
        }
        return  totalGpa/semesterTranscripts.size();
    }

    @Override
    public void printTranscript() {
        System.out.println("The "+ academicYear +" Transcript is showing below: ");
        for(Transcript t : semesterTranscripts){
            t.printTranscript();
        }
        System.out.println("The Total GPA for this year is"+ this.getGPA());


    }
}
