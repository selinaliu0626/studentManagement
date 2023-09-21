package transcript;
//composite pattern

public interface Transcript {
    public void addTranscript(Transcript transcript);
    public void removeTranscript(Transcript transcript);
    public double getGPA();
    public void printTranscript();
}
