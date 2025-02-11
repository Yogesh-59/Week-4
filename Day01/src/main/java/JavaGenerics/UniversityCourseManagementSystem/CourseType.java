package JavaGenerics.UniversityCourseManagementSystem;
//creating abstract class
abstract class CourseType {
    //Make the instance of class
    private String courseName;
    //initialize the instance using constructor
    CourseType(String courseName){
        this.courseName=courseName;
    }
    //Method use to get the name
    public String getName(){
        return courseName;
    }
    //abstract method to access the all subclass
   public abstract void getEvaluate();
}
