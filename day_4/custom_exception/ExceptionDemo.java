package day_4.custom_exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BankAccount account1= new BankAccount(5000);
        System.out.println("Enter the Amount to be Withdrawn");
        int amountToWithdraw= sc.nextInt();
        try {
            account1.withdraw(amountToWithdraw);
        } catch (LowBalanceExecption e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}
