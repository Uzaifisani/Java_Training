package collection_framework.set_operations;

import collection_framework.Employee;
import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<Employee> employeeSet = new HashSet<>();
        
        employeeSet.add(new Employee(1, "Uzaif", 50000));
        employeeSet.add(new Employee(2, "Mahek", 60000));
        employeeSet.add(new Employee(3, "Nihal", 45000));
        employeeSet.add(new Employee(4, "Abdullah", 70000));
        employeeSet.add(new Employee(5, "Ammar", 55000));

        System.out.println("Added 5 employess with different Ids");
        for (Employee e : employeeSet) {
            System.out.println(e);
        }
        
        boolean added = employeeSet.add(new Employee(1, "Uzaif", 50000));
        System.out.println("Attempt to add duplicate employee: " + (added ? "Success" : "Failed"));
        
        System.out.println("All employees in the set:");
        for (Employee e : employeeSet) {
            System.out.println(e);
        }
        System.out.println();
        Employee searchEmployee = new Employee(3, "Nihal", 45000);
        boolean exists = employeeSet.contains(searchEmployee);
        System.out.println("Employee " + searchEmployee + " exists in the set: " + exists);
    }
}
