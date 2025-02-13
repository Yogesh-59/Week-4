package JavaStream.serializationSaveandRetrieveanObject;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String fileName = "employees.ser";
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000, fileName));
        employees.add(new Employee(2, "Bob", "IT", 60000, fileName));
        employees.add(new Employee(3, "Charlie", "Finance", 55000, fileName));

        Employee employeeHandler = new Employee(0, "", "", 0, fileName);
        employeeHandler.serializeEmployees(employees);

        List<Employee> deserializedEmployees = employeeHandler.deserializeEmployees();
        System.out.println("Deserialized Employees:");
        deserializedEmployees.forEach(System.out::println);
    }
}
