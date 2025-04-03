package collection_framework.stack_operations;
import collection_framework.Employee;
import java.util.Stack;

public class StackOperationsDemo {
    public static void main(String[] args) {
        Stack<Employee> employeeStack = new Stack<>();

        System.out.println("Pushing employees onto the stack:");
        employeeStack.push(new Employee(1, "John Doe", 50000.0));
        employeeStack.push(new Employee(2, "Jane Smith", 60000.0));
        employeeStack.push(new Employee(3, "Bob Johnson", 55000.0));
        employeeStack.push(new Employee(4, "Alice Brown", 65000.0));
        employeeStack.push(new Employee(5, "Charlie Wilson", 70000.0));

        System.out.println("\nCurrent stack contents:");
        for (Employee emp : employeeStack) {
            System.out.println(emp);
        }

        System.out.println("\nPopping the top employee:");
        Employee poppedEmployee = employeeStack.pop();
        System.out.println("Popped employee: " + poppedEmployee);

        System.out.println("\nPeeking at the top employee:");
        Employee topEmployee = employeeStack.peek();
        System.out.println("Top employee: " + topEmployee);

        // Search for an employee in the stack
        Employee searchEmployee = new Employee(3, "Bob Johnson", 55000.0);
        int position = employeeStack.search(searchEmployee);
        System.out.println("\nSearching for employee Bob Johnson:");
        if (position != -1) {
            System.out.println("Employee found at position " + position + " from the top");
        } else {
            System.out.println("Employee not found in the stack");
        }

        System.out.println("\nChecking if stack is empty:");
        System.out.println("Is stack empty? " + employeeStack.isEmpty());

        System.out.println("\nRemaining employees in stack:");
        while (!employeeStack.isEmpty()) {
            System.out.println(employeeStack.pop());
        }

        System.out.println("\nFinal empty check:");
        System.out.println("Is stack empty? " + employeeStack.isEmpty());
    }
}