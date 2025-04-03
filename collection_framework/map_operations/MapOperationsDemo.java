package collection_framework.map_operations;

import java.util.HashMap;
import java.util.Map;

public class MapOperationsDemo {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee(1, "Uzaif Isani", 50000.0, 22));
        employeeMap.put(2, new Employee(2, "Muskan P", 60000.0, 20));
        employeeMap.put(3, new Employee(3, "Mahek W", 55000.0, 24));
        employeeMap.put(4, new Employee(4, "Nihal W", 65000.0, 24));
        employeeMap.put(5, new Employee(5, "Ammar K", 70000.0, 23));

        System.out.println("\nRetrieving employee with ID 3:");
        Employee employee = employeeMap.get(3);
        System.out.println(employee);

        System.out.println("\nRemoving employee with ID 2:");
        employeeMap.remove(2);
        System.out.println("Employee with ID 2 has been removed.");

        System.out.println("\nAll remaining employees:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}