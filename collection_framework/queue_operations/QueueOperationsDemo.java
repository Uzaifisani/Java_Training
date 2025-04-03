package collection_framework.queue_operations;
import collection_framework.Employee;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperationsDemo {
    public static void main(String[] args) {
        Queue<Employee> employeeQueue = new LinkedList<>();

        System.out.println("Adding employees to the queue:");
        employeeQueue.offer(new Employee(1, "Uzaif Isani", 50000.0));
        employeeQueue.offer(new Employee(2, "Nihal Wasta", 60000.0));
        employeeQueue.offer(new Employee(3, "Iqra K", 55000.0));
        employeeQueue.offer(new Employee(4, "Mahek W", 65000.0));
        employeeQueue.offer(new Employee(5, "Abdullah K", 70000.0));

        System.out.println("\nCurrent queue contents:");
        for (Employee emp : employeeQueue) {
            System.out.println(emp);
        }

        System.out.println("\nRemoving the front employee:");
        Employee removedEmployee = employeeQueue.poll();
        System.out.println("Removed employee: " + removedEmployee);

        System.out.println("\nChecking if queue is empty:");
        System.out.println("Is queue empty? " + employeeQueue.isEmpty());

        System.out.println("\nCurrent queue size: " + employeeQueue.size());

        // Process all remaining employees in the queue
        System.out.println("\nProcessing remaining employees:");
        while (!employeeQueue.isEmpty()) {
            Employee currentEmployee = employeeQueue.poll();
            System.out.println("Processing: " + currentEmployee);
        }

        System.out.println("\nFinal empty check:");
        System.out.println("Is queue empty? " + employeeQueue.isEmpty());
    }
}