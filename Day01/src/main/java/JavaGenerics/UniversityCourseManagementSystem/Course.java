package JavaGenerics.UniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;
//generic class to manage different courses.
public class Course <T extends CourseType>{
    public T course;
    //creating list to store the course detail
     List<T> list=new ArrayList<>();
     //Method to add course in list
     public void addCourse(T courseName){
       list.add(courseName)  ;
     }
     //Method to evaluate the course details
     public void evaluate(){
         course.getEvaluate();
     }
     //Method to return the all list elements
    public List<T> getAll(){

         return list;
    }
}
