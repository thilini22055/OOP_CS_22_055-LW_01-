import java.util.ArrayList;
public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;
    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void appointDepartmentHead(Lecturer lecturer) { this.departmentHead = lecturer; }
    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) departmentHead.displayInfo();
    }
    public void offerCourse(Course course) { coursesOffering.add(course); }
    public void withdrawCourse(Course course) { coursesOffering.remove(course); }
    public void addLecturer(Lecturer lecturer) { lecturersBelongsTo.add(lecturer); }
    public void removeLecturer(Lecturer lecturer) { lecturersBelongsTo.remove(lecturer); }
    public void displayInfo() {
        System.out.println("Department: " + name);
    }
}

