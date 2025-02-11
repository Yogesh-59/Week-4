package JavaGenerics.UniversityCourseManagementSystem;
//Create the ExamCourse class that extends Course Type class
 class ExamCourse extends CourseType {
     //using constructor to initialize the instance
    ExamCourse(String name){
        super(name);
    }
    //Method to evaluate the course type
    @Override
     public void getEvaluate(){
        System.out.println(getName());
    }
}
