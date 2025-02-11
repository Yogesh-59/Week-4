package JavaGenerics.AIDrivenResumeScreeningSystem;

import java.util.ArrayList;
import java.util.List;
// Generic class to handle resumes dynamically based on job roles
public class Resume<T extends JobRole> {
     public T jobRole;
    // Constructor to initialize with a specific job role
      Resume(T jobRole){
          this.jobRole=jobRole;
      }
     List<T> list=new ArrayList<>();
     public void addRole(T role){
         list.add(role);
     }
     public List<T> getRole(){
         return list;
     }
    // Method to process the resume
     public void process(){
         jobRole.processResume();
     }
}
