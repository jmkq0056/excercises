package nine;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person implements UniversityMember {
    private List<Course> courses;

    public Faculty(String name, int age) {
        super(name, age);
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setFaculty(this);
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String getRole() {
        return "Faculty";
    }
}
