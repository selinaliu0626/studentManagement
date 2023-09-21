package faculty;

import Student.Student;
import Utils.Message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Advisor class using Singleton pattern
public class Advisor extends FulltimeFaculty {
    private static Advisor undergraduateInstance = null;
    private static Advisor graduateInstance = null;

    private Map<Integer, List<Message>> communications;
    private Map<Integer,Student> serveStudents;

    private Advisor(int id,String name,String email) {
        super(id, name, email);
        communications = new HashMap<>();
    }

    public static synchronized Advisor getUndergraduateInstance(int id,String name,String email) {
        if (undergraduateInstance == null) {
            undergraduateInstance = new Advisor(id,name,email);
        }
        return undergraduateInstance;
    }

    public static synchronized Advisor getGraduateInstance(int id, String name,String email) {
        if (graduateInstance == null) {
            graduateInstance = new Advisor(id,name,email);
        }
        return graduateInstance;
    }


 public List<Message> searchMessage(Student s){
        return this.communications.get(s.getId());
 }
    public Map<Integer, Student> getServeStudents() {
        return serveStudents;
    }

    public void setServeStudents(Map<Integer, Student> severStudents) {
        this.serveStudents = severStudents;
    }

}
