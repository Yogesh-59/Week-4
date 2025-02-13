package PracticeListAndSet.InsurancePolicyManagementSystem;
import java.time.LocalDate;
import java.util.*;
public class PolicyManager {
    private HashSet<InsurancePolicy> hashSetPolicies = new HashSet<>();
    private LinkedHashSet<InsurancePolicy> linkedHashSetPolicies = new LinkedHashSet<>();
    private TreeSet<InsurancePolicy> treeSetPolicies = new TreeSet<>();

    // Add policy to all sets
    public void addPolicy(InsurancePolicy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    // Get policies expiring within next 30 days
    public List<InsurancePolicy> getPoliciesExpiringSoon() {
        List<InsurancePolicy> expiringSoon = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysLater = today.plusDays(30);

        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getExpiryDate().isBefore(thirtyDaysLater) &&
                    !policy.getExpiryDate().isBefore(today)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    // Get policies by coverage type
    public List<InsurancePolicy> getPoliciesByCoverageType(String coverageType) {
        List<InsurancePolicy> matchingPolicies = new ArrayList<>();
        for (InsurancePolicy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                matchingPolicies.add(policy);
            }
        }
        return matchingPolicies;
    }

    // Performance comparison method
    public void comparePerformance() {
        // Test data
        List<InsurancePolicy> testPolicies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            testPolicies.add(new InsurancePolicy(
                    "POL" + i,
                    "Holder" + i,
                    LocalDate.now().plusDays(i % 365),
                    "Health",
                    1000.0
            ));
        }

        // Test HashSet
        long startTime = System.nanoTime();
        HashSet<InsurancePolicy> testHashSet = new HashSet<>();
        for (InsurancePolicy policy : testPolicies) {
            testHashSet.add(policy);
        }
        long hashSetTime = System.nanoTime() - startTime;

        // Test LinkedHashSet
        startTime = System.nanoTime();
        LinkedHashSet<InsurancePolicy> testLinkedHashSet = new LinkedHashSet<>();
        for (InsurancePolicy policy : testPolicies) {
            testLinkedHashSet.add(policy);
        }
        long linkedHashSetTime = System.nanoTime() - startTime;

        // Test TreeSet
        startTime = System.nanoTime();
        TreeSet<InsurancePolicy> testTreeSet = new TreeSet<>();
        for (InsurancePolicy policy : testPolicies) {
            testTreeSet.add(policy);
        }
        long treeSetTime = System.nanoTime() - startTime;

        System.out.println("Performance Results (in milliseconds):");
        System.out.println("HashSet: " + hashSetTime / 1_000_000.0);
        System.out.println("LinkedHashSet: " + linkedHashSetTime / 1_000_000.0);
        System.out.println("TreeSet: " + treeSetTime / 1_000_000.0);
    }

    // Get all policies from different sets
    public void displayAllPolicies() {
        System.out.println("\nHashSet Policies (Unordered):");
        hashSetPolicies.forEach(System.out::println);

        System.out.println("\nLinkedHashSet Policies (Insertion Order):");
        linkedHashSetPolicies.forEach(System.out::println);

        System.out.println("\nTreeSet Policies (Sorted by Expiry Date):");
        treeSetPolicies.forEach(System.out::println);
    }
}
