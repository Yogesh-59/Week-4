package QueueInterface.HospitalTriageSystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt(Patient::getSeverity).reversed());
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));
        while (!triageQueue.isEmpty()) {
            Patient currentPatient = triageQueue.poll();
            System.out.println( currentPatient);
        }
    }
}
