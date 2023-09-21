package programs;

import Utils.Major;

public class DegreeProgramFactory {
    public BSProgram createBSprogram(Major major,String theisRequirements){
        return new BSProgram(major,theisRequirements);
    }
    public MSProgram createMSprogram(Major major,String theisRequirements){
        return new MSProgram(major,theisRequirements);
    }
}
