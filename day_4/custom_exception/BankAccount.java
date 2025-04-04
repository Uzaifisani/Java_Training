package day_4.custom_exception;

public class BankAccount {
    private double balance;
    public BankAccount(double  initialBalance){
        this.balance=initialBalance;
    }
    public void withdraw(double  amount) throws LowBalanceExecption{
        if(amount>balance){
            throw new LowBalanceExecption("Insufficien Balance");
        }
        balance-=amount;
        System.out.println("Withdrawal Successfull. New Updated Balance is "+balance);
    }
}
