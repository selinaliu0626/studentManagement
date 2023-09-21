package courseAndConcentrations;

import faculty.FulltimeFaculty;

import java.util.ArrayList;
import java.util.List;

public class TopLevelConcentration extends CourseComponent implements Concentration{

    private FulltimeFaculty chairman;

    private List<SubConcentration> subConcentrations;

    public TopLevelConcentration(String id, String name, String description) {
        super(id, name, description);
        this.subConcentrations = new ArrayList<>();
    }
    public TopLevelConcentration(String id, String name, String description,FulltimeFaculty chairman) {
        super(id, name, description);
        this.chairman = chairman;
        this.subConcentrations = new ArrayList<>();
    }

    public List<SubConcentration> getSubConcentrations() {
        return subConcentrations;
    }

    public void setSubConcentrations(List<SubConcentration> subConcentrations) {
        this.subConcentrations = subConcentrations;
    }

    public void setChairman(FulltimeFaculty f) {
        this.chairman = f;
    }
    public FulltimeFaculty getChairman(){
        return chairman;
    }

    @Override
    public void addCourse(Course course) {

    }

    @Override
    public void removeCourse(Course course) {

    }

    @Override
    public void setCoordinator(FulltimeFaculty coordinator) {

    }

    public List<FulltimeFaculty> getCoordinator() {
        List<FulltimeFaculty> coordinators = new ArrayList<FulltimeFaculty>();
        coordinators.add(chairman);
        for(Concentration sub: subConcentrations){
            for(FulltimeFaculty f: sub.getCoordinator()){
                coordinators.add(f);            }
        }
        return coordinators;

    }


    @Override
    String getTitle() {
        return getName();
    }

    @Override
    String getSectionTitle() {
        return "SubConcentrations";
    }

    @Override
    List<String> getItems() {
        List<String> items = new ArrayList<String>();
        for(SubConcentration sub: subConcentrations){
            items.add(sub.format());
        }
        return items;
    }
}
