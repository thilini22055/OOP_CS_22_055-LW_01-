public class Main {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Dr. Smith", "CS101");
        Course course1 = new Course("Introduction to Programming", "CS101", lecturer1);
        Student student1 = new Student("Alice Johnson", "Computer Science", "CS101");

        System.out.println("Course Details:");
        System.out.println("Course Name: " + course1.getCourseName());
        System.out.println("Course Code: " + course1.getCourseCode());
        System.out.println("Lecturer: " + course1.getLecturer().getLecturerName());
        System.out.println("Course Teaching: " + course1.getLecturer().getCourseTeaching());

        System.out.println("\nStudent Details:");
        System.out.println("Student Name: " + student1.getStudentName());
        System.out.println("Degree: " + student1.getDegreeName());
        System.out.println("Course Following: " + student1.getCourseFollowing());
    }
}

