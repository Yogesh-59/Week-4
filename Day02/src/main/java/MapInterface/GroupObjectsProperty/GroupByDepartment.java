package MapInterface.GroupObjectsProperty;
import java.util.*;
public class GroupByDepartment {
    Map<String, List<Employee>> map;
     GroupByDepartment(){
         map=new HashMap<>();
     }
     public Map<String,List<Employee>> groupByDepartment(List<Employee> employee){
         for (Employee emp : employee) {
             if (!map.containsKey(emp.department)) {
                 map.put(emp.department, new ArrayList<>());
             }
            map.get(emp.department).add(emp);
         }

         return map;
     }
}
