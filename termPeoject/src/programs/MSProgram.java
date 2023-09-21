package programs;

import Utils.Major;

public class MSProgram extends DegreeProgram implements Program{
    public static final int yearly = 2;

    public MSProgram(Major major, String thesisRequirements) {
        super(major, thesisRequirements);
    }
    @Override
    public void enrolled(){
        System.out.println("enrolled in "+"MS"+this.getMajor());
    }
}
