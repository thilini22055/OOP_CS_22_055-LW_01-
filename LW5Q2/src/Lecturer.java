import java.util.ArrayList;
public class Lecturer extends Person {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;
    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public void setDepartment(Department department) { this.department = department; }
    public void displayInfo() {
        System.out.println("Lecturer: " + getName() + ", Position: " + position);
    }
    public void displayDepartmentInfo() {
        if (department != null) department.displayInfo();
    }
    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }
    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }
    public void listCoursesTeaching() {
        for (Course c : coursesTeaching) c.displayInfo();
    }
}

