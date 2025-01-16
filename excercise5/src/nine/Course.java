package nine;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private Faculty faculty;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course: " + name + ", Faculty: " + (faculty != null ? faculty.getName() : "None");
    }
}
