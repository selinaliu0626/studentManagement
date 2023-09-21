package management;
//use facade pattern

public class CSdepartment {
    private static CSdepartment instance = null;
    private CourseManagement courseManagement;
    private FacultyManagement facultyManagement;
    private StudentManagement studentManagement;
    private ProgramManagement programManagement;
    public CSdepartment() {
        courseManagement = CourseManagement.getInstance();
        facultyManagement = FacultyManagement.getInstance();
        studentManagement = StudentManagement.getInstance();
        programManagement = ProgramManagement.getInstance();
    }

    public static CSdepartment getInstance() {
       if (instance == null) {
           return  new CSdepartment();
       }
       return instance;
    }

    public CourseManagement getCourseManagement() {
        return courseManagement;
    }

    public FacultyManagement getFacultyManagement() {
        return facultyManagement;
    }

    public StudentManagement getStudentManagement() {
        return studentManagement;
    }

    public ProgramManagement getProgramManagement() {
        return programManagement;
    }

}
