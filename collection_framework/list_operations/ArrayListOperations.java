package collection_framework.list_operations;
import collection_framework.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<>();

        employees.add(new Employee(1, "Uzaif", 50000));
        employees.add(new Employee(2, "Mahek", 60000));
        employees.add(new Employee(3, "Nihal", 45000));
        employees.add(new Employee(4, "Iqra", 70000));
        employees.add(new Employee(5, "Abdullah", 55000));

        System.out.println("Original Employee using Array List");
        printEmployees(employees);

        //System.out.println("Removing employee of Index 2 which is Nihal");
        int indexToRemove=2;
        employees.remove(indexToRemove);
        System.out.println("After Removing index 2 Nihal From the List");
        printEmployees(employees);

        System.out.println("Sorting Based on Salary");
        Collections.sort(employees,Comparator.comparingDouble(Employee::getSalary));
        printEmployees(employees);

        System.out.println("Employee with the Highest Salary");
        Employee highestPayedEmployee = Collections.max(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Employee with the Highest Salary is "+highestPayedEmployee);

        System.out.println("Converting to Linked LIst");

        LinkedList<Employee> linkedListEmployees= new LinkedList<>(employees);
        for (Employee e : linkedListEmployees) {
            System.out.println(e);
        }

    }
    //Method to Print Employee
    public static void printEmployees(ArrayList<Employee> employees){
        for(Employee e: employees){
            System.out.println(e);
        }
    }
}
