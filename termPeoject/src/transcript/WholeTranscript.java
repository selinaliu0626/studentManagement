package transcript;



import java.util.ArrayList;
import java.util.List;

public class WholeTranscript implements Transcript {
    List<Transcript> yearlyTranscripts;

    public WholeTranscript() {
        yearlyTranscripts = new ArrayList<Transcript>();
    }

    @Override
    public void addTranscript(Transcript transcript) {
        yearlyTranscripts.add(transcript);
    }

    @Override
    public void removeTranscript(Transcript transcript) {
    yearlyTranscripts.remove(transcript);
    }

    @Override
    public double getGPA() {
        double totalGpa =0.0;
        for(Transcript t:yearlyTranscripts){
            totalGpa += t.getGPA();
        }
        return totalGpa/ yearlyTranscripts.size();
    }

    @Override
    public void printTranscript() {
        int size = yearlyTranscripts.size();
        System.out.println("The Whole Transcript: ");
        for(Transcript t:yearlyTranscripts){
            t.printTranscript();
        }
        System.out.println("Total GPA is: "+getGPA());

    }
}
