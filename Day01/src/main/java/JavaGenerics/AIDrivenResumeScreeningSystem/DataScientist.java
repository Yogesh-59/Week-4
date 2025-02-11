package JavaGenerics.AIDrivenResumeScreeningSystem;
//class DataScientist that extends the properties of JobRole class
public class DataScientist extends JobRole{
    @Override
    void processResume() {
        System.out.println("Processing Data Scientist Resume");
    }
}
