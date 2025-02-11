package JavaGenerics.UniversityCourseManagementSystem;
//Method Research course that extends properties of Course Type
public class ResearchCourse extends CourseType {
    //Constructor to initialize the instance
    ResearchCourse(String courseName){
        super(courseName);
    }
    //Method to evaluate the course type
    @Override
    public void getEvaluate() {
        System.out.println(getName() );
    }
}
