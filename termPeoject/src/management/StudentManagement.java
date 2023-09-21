package management;

import Student.Student;
import Student.BSstudent;
import Student.MSstudent;
import Student.CertificateStudent;
import programs.Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement {
    private static StudentManagement instance = null;
    private Map<Integer, CertificateStudent> certificateStudents;
    private Map<Integer,MSstudent> graduateStudents;
    private Map<Integer,BSstudent> undergraduateStudents;

    private StudentManagement() {
       certificateStudents = new HashMap<>();
       graduateStudents= new HashMap<>();
       undergraduateStudents = new HashMap<>();
    }

    public static StudentManagement getInstance() {
        if (instance == null) {
            instance = new StudentManagement();
        }
        return instance;
    }
    public BSstudent createBsStudent(int id, String name, Program p){
        BSstudent student = new BSstudent(id,name,p);
        return student;
    }
    public MSstudent createMSStudent(int id, String name, Program p){
        MSstudent student = new MSstudent(id,name,p);
        return student;
    }
    public CertificateStudent certificateStudent(int id, String name ,Program p){
        CertificateStudent student = new CertificateStudent(id,name,p);
        return student;
    }
}
