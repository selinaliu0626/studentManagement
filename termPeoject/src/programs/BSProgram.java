package programs;

import Utils.Major;
import courseAndConcentrations.Course;

import java.util.List;

public class BSProgram extends DegreeProgram implements Program {
    public static final int yearly = 4;

    public BSProgram(Major major, String thesisRequirements) {
        super(major, thesisRequirements);
    }

    @Override
    public void enrolled() {
        System.out.println("enrolled in " + "BS" + this.getMajor());
    }
}


