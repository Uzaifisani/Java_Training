package collection_framework.list_operations;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Employee> employeeLinkedList = new LinkedList<>();
        employeeLinkedList.add(new Employee(1, "Uzaif", 50000));
        employeeLinkedList.add(new Employee(2, "Mahek", 60000));
        employeeLinkedList.add(new Employee(3, "Nihal", 45000));
        employeeLinkedList.add(new Employee(4, "Iqra", 70000));
        employeeLinkedList.add(new Employee(5, "Abdullah", 55000));
        employeeLinkedList.add(new Employee(6, "Aafaan", 55000));
        employeeLinkedList.add(new Employee(7, "Vaishnavi", 76000));
        employeeLinkedList.add(new Employee(8, "Ammar", 42000));
        employeeLinkedList.add(new Employee(9, "Sara", 70000));
        employeeLinkedList.add(new Employee(10, "Ibrahim", 45000));

        System.out.println("Original Employee List");
        printEmployees(employeeLinkedList);

        System.out.println("Third Employee from the List");
        Employee thirdEmployee =employeeLinkedList.get(2);
        System.out.println(thirdEmployee);

        System.out.println("Replace employee at index 2 (Nihal with samarth)");
        employeeLinkedList.set(2, new Employee(3, "Samarth", 87000));
        printEmployees(employeeLinkedList);

        String nameToRemove="Sara";
        employeeLinkedList.removeIf(e -> e.getName().equals(nameToRemove));
        System.out.println("List After removing Sara as a Employee");
        printEmployees(employeeLinkedList);
    }
    //Method to Print Employee
    public static void printEmployees(LinkedList<Employee> employees){
        for(Employee e: employees){
            System.out.println(e);
        }
    }
}
