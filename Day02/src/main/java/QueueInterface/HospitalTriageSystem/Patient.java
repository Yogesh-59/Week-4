package QueueInterface.HospitalTriageSystem;

public class Patient {
    public String name;
    public int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    public int getSeverity() {
        return severity;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
