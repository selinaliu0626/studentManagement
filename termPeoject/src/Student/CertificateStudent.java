package Student;

import Utils.Message;
import Utils.Person;
import programs.Program;

public class CertificateStudent extends Student {
    public CertificateStudent(int id, String name,Program p) {
        super(id, name);
        this.strategy = new EnrolledCourseStrategy(p.getCoreCourses(),p.getEletiveCourses());
    }

    public CertificateStudent(int id, String name, Program enrolledProgram, CourseSelectStrategy strategy) {
        super(id, name, enrolledProgram, strategy);
    }

    @Override
    public void send(Message m, Person p) {

    }

    @Override
    public void receive(Message m, Person p) {

    }
}
