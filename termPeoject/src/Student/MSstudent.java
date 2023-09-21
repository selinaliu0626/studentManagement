package Student;

import Utils.Message;
import Utils.Person;
import Utils.SchoolTime;
import programs.Program;

public class MSstudent extends Student{
    public MSstudent(int id, String name, Program p) {

        super(id, name);
        this.strategy = new EnrolledCourseStrategy(p.getCoreCourses(),p.getEletiveCourses());
    }



}
