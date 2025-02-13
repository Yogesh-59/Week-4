package MapAndQueuePractice.InsurancePolicyManagement;
import java.util.*;
public class InsurancePolicy {
    String policyNumber;
    String policyholderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "Policy[" + policyNumber + ", " + policyholderName + ", " + expiryDate + ", " + coverageType + ", " + premiumAmount + "]";
    }
}
