package day_4.exceptional_handling;

import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("Enter No 1 ");
            int num1= sc.nextInt();
            System.out.println("Enter no 2");
            int num2= sc.nextInt();
            int[] arr = {1, 2, 3};
            System.err.println("Division result is "+(num1/num2));
            System.out.println("Array element: " + arr[num1]);
            sc.close();

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: "+e.getClass().getSimpleName());
            System.out.println("Error message: " + e.getMessage());
        }

    }

}
