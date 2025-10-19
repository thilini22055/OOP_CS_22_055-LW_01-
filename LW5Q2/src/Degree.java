import java.util.ArrayList;
public class Degree {
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;
    public Degree(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getNumberOfStudents() { return numberOfStudents; }
    public void setNumberOfStudents(Integer numberOfStudents) { this.numberOfStudents = numberOfStudents; }
    public void offerCourse(Course course) { coursesOffering.add(course); }
    public void withdrawCourse(Course course) { coursesOffering.remove(course); }
    public void listCoursesOffering() {
        for (Course c : coursesOffering) c.displayInfo();
    }
    public void displayInfo() {
        System.out.println("Degree: " + name + ", Students: " + numberOfStudents);
    }
}
