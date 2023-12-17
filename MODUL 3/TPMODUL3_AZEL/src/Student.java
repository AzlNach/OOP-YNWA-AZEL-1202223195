import java.util.ArrayList;

class Student extends User{
    protected ArrayList<String> enrolledCourses;

    public Student(String Name, int id) {
        super(Name, id);
        enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
    }

    @Override
    public String getUserDetail() {
    return "Student - " + super.getUserDetail() +
            "\nEnrolled Courses: " +"["+ String.join(", ", enrolledCourses)+"]"+ "\n";
    }

}