public class Course {
    private String name;
    private String enrollType;
    private Integer numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;
    public Course(String name, String enrollType, Integer numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEnrollType() { return enrollType; }
    public void setEnrollType(String enrollType) { this.enrollType = enrollType; }
    public Integer getNumberOfStudentsEnrolled() { return numberOfStudentsEnrolled; }
    public void setNumberOfStudentsEnrolled(Integer numberOfStudentsEnrolled) { this.numberOfStudentsEnrolled = numberOfStudentsEnrolled; }
    public void addLecturerInCharge(Lecturer lecturer) { this.lecturerInCharge = lecturer; }
    public void removeLecturerInCharge() { this.lecturerInCharge = null; }
    public void addDegreeBelongsTo(Degree degree) { this.degreeBelongsTo = degree; }
    public void removeDegreeBelongsTo() { this.degreeBelongsTo = null; }
    public void displayInfo() {
        System.out.println("Course: " + name + ", Type: " + enrollType + ", Students: " + numberOfStudentsEnrolled);
    }
}

