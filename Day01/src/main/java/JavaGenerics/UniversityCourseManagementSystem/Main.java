package JavaGenerics.UniversityCourseManagementSystem;

import java.util.List;

public class Main {
    //Method to print the all elements in list
    static void printResult(List<? extends CourseType> courses){
        for(CourseType course: courses){
            System.out.println("course : "+ course.getName());
            //course.getEvaluate();
        }
    }
    //Main method
    public static void main(String[] args) {
        //creating the object of generic class
        Course<ExamCourse> exam=new Course<>();
        //add the courses with help of object
        exam.addCourse(new ExamCourse("IIT JEE"));
        exam.addCourse(new ExamCourse("UPSC NDA"));
        exam.addCourse(new ExamCourse("GATE CSE"));
        //print the all courses
        printResult(exam.getAll());
        System.out.println("-----------------------------------");
        //creating the object of generic class and pass the AssignmentCourse
        Course<AssignmentCourse> assignment=new Course<>();
        //adding the Assignment Course in list
        assignment.addCourse(new AssignmentCourse("CORE JAVA"));
        assignment.addCourse(new AssignmentCourse("OBJECT BASE MODELLING"));
        assignment.addCourse(new AssignmentCourse("SPRING BOOT"));
        //print the all Assignment Course
        printResult(assignment.getAll());
        System.out.println("-----------------------------------");
        //creating the object of generic class and pass the Research Course
        Course<ResearchCourse> reserch=new Course<>();
        //adding the Research Course in list
        reserch.addCourse(new ResearchCourse("ARTIFICIAL INTELLIGENCE"));
        reserch.addCourse(new ResearchCourse("BLOCK CHAIN"));
        reserch.addCourse(new ResearchCourse("QUANTUM COMPUTING"));
        printResult(reserch.getAll());
    }
}
