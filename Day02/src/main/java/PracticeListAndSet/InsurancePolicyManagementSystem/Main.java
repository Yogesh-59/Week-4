package PracticeListAndSet.InsurancePolicyManagementSystem;
import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Add sample policies
        manager.addPolicy(new InsurancePolicy("P001", "Deepraj",
                LocalDate.now().plusDays(20), "Health", 1500.0));
        manager.addPolicy(new InsurancePolicy("P002", "Rishi ",
                LocalDate.now().plusDays(45), "Auto", 2000.0));
        manager.addPolicy(new InsurancePolicy("P003", "Mohit Tiwari",
                LocalDate.now().plusDays(15), "Home", 2500.0));

        // Display all policies
        manager.displayAllPolicies();

        // Display policies expiring soon
        System.out.println("Policies Expiring Soon: ");
        manager.getPoliciesExpiringSoon().forEach(System.out::println);

        // Display policies by coverage type
        System.out.println("Health Insurance Policies: ");
        manager.getPoliciesByCoverageType("Health").forEach(System.out::println);

        // Compare performance
        System.out.println("Performance Comparison: ");
        manager.comparePerformance();
    }
}
