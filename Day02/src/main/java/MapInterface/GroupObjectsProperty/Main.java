package MapInterface.GroupObjectsProperty;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> emp=Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );
        GroupByDepartment group=new GroupByDepartment();
        Map<String, List<Employee>> groupedEmployees = group.groupByDepartment(emp);
        for(Map.Entry<String ,List<Employee>> entry:groupedEmployees.entrySet() ){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
