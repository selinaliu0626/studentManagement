package management;

import faculty.ChairPerson;
import faculty.Faculty;
import faculty.FulltimeFaculty;
import programs.BSProgram;

import java.util.HashMap;
import java.util.Map;

public class FacultyManagement {
    private static FacultyManagement instance = null;
    private static Map<Integer, Faculty> facultyMap;

    public FacultyManagement() {
        facultyMap = new HashMap<>();
    }

    public static FacultyManagement getInstance() {
        if (instance == null) {
            instance = new FacultyManagement();
        }
        return instance;
    }
    public void addFaculty(Faculty f){
        facultyMap.put(f.getId(), f);
    }
    public void removeFaculty(Faculty f){
        facultyMap.remove(f.getId());
    }
    Faculty getFaculty(int id){
        return  facultyMap.get(id);
    }
    public ChairPerson setChairPerson() {
        return ChairPerson.getInstance();
    }
}
