package MapAndQueuePractice.InsurancePolicyManagement;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        PolicyManagement manager = new PolicyManagement();

        manager.addPolicy(new InsurancePolicy("P001", "Deepraj", new Date(2025, 2, 10), "Health", 500.0));
        manager.addPolicy(new InsurancePolicy("P002", "Aryan", new Date(2024, 3, 15), "Auto", 700.0));
        manager.addPolicy(new InsurancePolicy("P003", "Rishi", new Date(2024, 4, 20), "Home", 900.0));
        manager.addPolicy(new InsurancePolicy("P004", "Mothit", new Date(2023, 5, 30), "Health", 600.0));

        System.out.println("Retrieve Policy P002: " + manager.getPolicy("P002"));
        manager.displayExpiringSoon();
        manager.displayPoliciesByHolder("Arayn");
        manager.removeExpiredPolicies();
    }
}
