package JavaGenerics.AIDrivenResumeScreeningSystem;
//class ProductManager that extends the properties of JobRole class
public class ProductManager extends JobRole{
    @Override
    void processResume() {
        System.out.println("Processing Product Manager Resume");
    }
}
