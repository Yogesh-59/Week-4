package JavaGenerics.AIDrivenResumeScreeningSystem;
//class software Engineer that extends the properties of JobRole class
public class SoftwareEngineer extends JobRole{
    @Override
    //Method to process Resumes
     public void processResume() {
        System.out.println("Processing Software Engineer Resume");
    }
}
