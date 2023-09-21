package Student;

import Utils.SchoolTime;
import programs.Program;

public class BSstudent extends Student{
    public BSstudent(int id, String name) {
        super(id, name);

    }

    public BSstudent(int id, String name, Program enrolledProgram) {
        super(id, name, enrolledProgram);
        this.strategy = new EnrolledCourseStrategy(enrolledProgram.getCoreCourses(),enrolledProgram.getEletiveCourses());
    }

    public BSstudent(int id, String name, Program enrolledProgram, CourseSelectStrategy strategy) {
        super(id, name, enrolledProgram, strategy);
    }


}
