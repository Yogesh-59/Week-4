package MapAndQueuePractice.InsurancePolicyManagement;
import java.util.*;
public class PolicyManagement {
    Map<String, InsurancePolicy> hashMap = new HashMap<>();
    Map<String, InsurancePolicy> linkedHashMap = new LinkedHashMap<>();
    TreeMap<Date, InsurancePolicy> treeMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        hashMap.put(policy.policyNumber, policy);
        linkedHashMap.put(policy.policyNumber, policy);
        treeMap.put(policy.expiryDate, policy);
    }

    public InsurancePolicy getPolicy(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    public void displayExpiringSoon() {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = calendar.getTime();

        System.out.println("Policies Expiring Soon:");
        for (Map.Entry<Date, InsurancePolicy> entry : treeMap.entrySet()) {
            if (entry.getKey().before(threshold)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void displayPoliciesByHolder(String policyholder) {
        System.out.println("Policies for " + policyholder + ":");
        for (InsurancePolicy policy : hashMap.values()) {
            if (policy.policyholderName.equalsIgnoreCase(policyholder)) {
                System.out.println(policy);
            }
        }
    }

    public void removeExpiredPolicies() {
        Date today = new Date();
        Iterator<Map.Entry<Date, InsurancePolicy>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Date, InsurancePolicy> entry = iterator.next();
            if (entry.getKey().before(today)) {
                hashMap.remove(entry.getValue().policyNumber);
                linkedHashMap.remove(entry.getValue().policyNumber);
                iterator.remove();
            }
        }
        System.out.println("Expired policies removed.");
    }
}
