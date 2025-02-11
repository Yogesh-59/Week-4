package JavaGenerics.AIDrivenResumeScreeningSystem;

import java.util.List;

public class Main {
    // Resume screening that processes multiple resumes
    static public void screenResume(List<? extends JobRole>resumes){
        for(JobRole job:resumes){
            // Process each resume in the list
            job.processResume();
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> swe = new Resume<>(new SoftwareEngineer());
        swe.process();

        Resume<DataScientist> dsResume = new Resume<>(new DataScientist());
        dsResume.process();

        Resume<ProductManager> pmResume = new Resume<>(new ProductManager());
        pmResume.process();
    }

}
