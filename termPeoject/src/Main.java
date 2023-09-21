import Student.Student;
import Utils.Major;
import courseAndConcentrations.Course;
import faculty.ChairPerson;
import management.*;
import programs.Program;

public class Main {
    public static void main(String[] args) {

        CSdepartment csdepartment = CSdepartment.getInstance();
        FacultyManagement fm = csdepartment.getFacultyManagement();
        ChairPerson p =fm.setChairPerson();
        CourseManagement cm = csdepartment.getCourseManagement();
        Course java = cm.setNewCourse("cs520", "Java Programming", "Intro to Java Programming");
        System.out.println("Course: "+java.getName()+ "`s capacity is "+java.getCapacity());
        System.out.println("----------------------------------------------------------------");
        ProgramManagement pm = csdepartment.getProgramManagement();
        Program program = pm.createNewBSProgram(Major.CS, "related to Programming or theory in Computer Science");
        StudentManagement sm = csdepartment.getStudentManagement();
        Boolean successfullyEnrolled;
        //since the capacity is five, five students should have been successfully enrolled
        Student alice = sm.createBsStudent(230001, "Alice", program);
        successfullyEnrolled = cm.addStudent(java,alice);
       cm.printEnrollInfo(java,alice,successfullyEnrolled);
        Student bob = sm.createBsStudent(230002, "Bob", program);
        successfullyEnrolled= cm.addStudent(java,bob);
        cm.printEnrollInfo(java,bob,successfullyEnrolled);
        Student charile = sm.createBsStudent(23003, "Charlie", program);
        successfullyEnrolled = cm.addStudent(java,charile);
        cm.printEnrollInfo(java,charile,successfullyEnrolled);
        Student denny = sm.createBsStudent(23004, "Denny", program);
        successfullyEnrolled = cm.addStudent(java,denny);
        cm.printEnrollInfo(java,denny,successfullyEnrolled);
        Student frank = sm.createBsStudent(23005, "Frank", program);
        successfullyEnrolled = cm.addStudent(java,frank);
        cm.printEnrollInfo(java,frank,successfullyEnrolled);
        System.out.println("----------------------------------------------------------------");
        //since the capacity for the courses is 5, now is full ,gaby should not been enrolled in the courses
        Student gaby = sm.createBsStudent(23006, "Gaby", program);
        successfullyEnrolled= cm.addStudent(java,gaby);
        cm.printEnrollInfo(java,gaby,successfullyEnrolled);
        // bob will drop the courses,add gaby will automatically enroll in the java course
        System.out.println("----------------------------------------------------------------");
        cm.removeStudent(java,bob);


    }


}
