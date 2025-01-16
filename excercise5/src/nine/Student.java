package nine;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements UniversityMember {
    private List<Course> courses;

    public Student(String name, int age) {
        super(name, age);
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
