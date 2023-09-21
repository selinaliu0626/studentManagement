package management;

import Utils.Major;
import programs.BSProgram;
import programs.DegreeProgramFactory;
import programs.Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProgramManagement {

    private static ProgramManagement instance = null;
    DegreeProgramFactory factory;
    private static Map<String,Program> programMap;

    private ProgramManagement() {
        programMap = new HashMap<>();
        factory = new DegreeProgramFactory();
    }

    public static ProgramManagement getInstance() {
        if (instance == null) {
            instance = new ProgramManagement();
        }
        return instance;
    }
    public Program createNewBSProgram(Major major, String requirement){
        Program p = factory.createBSprogram(major, requirement);
        return p;
    }
}
