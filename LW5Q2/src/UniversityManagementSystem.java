public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department dept = new Department("Software Engineering");
        Degree degree = new Degree("Computer Science", 200);
        Course course = new Course("Object-Oriented Programming", "Full-time", 100);
        Lecturer lecturer = new Lecturer("Dr. Perera", "Senior Lecturer", dept);
        Student student = new Student("Thilini", "S001", "2nd Year", degree);
        dept.addLecturer(lecturer);
        dept.offerCourse(course);
        degree.offerCourse(course);
        lecturer.addCourse(course);
        student.enrollCourse(course);
        lecturer.displayInfo();
        lecturer.listCoursesTeaching();
        student.displayInfo();
        student.listCoursesEnrolled();
        degree.displayInfo();
        dept.displayInfo();
        course.displayInfo();
    }
}



