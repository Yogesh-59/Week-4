package JavaGenerics.UniversityCourseManagementSystem;
//Method Assignment course that extends properties of Course Type
 class AssignmentCourse extends CourseType{
     //Constructor to initialize the instance
     AssignmentCourse(String courseName){
         super(courseName);
     }
     @Override
     //Method use to evaluate the assignment Course
     public void getEvaluate() {
         System.out.println(getName() );
     }
}
