package lambda_expression;

interface Calculator{
    int calculate(int a, int b);
}

public class Task1{
    public static void main(String[] args) {
     Calculator add= (a,b)-> a+b;
     Calculator sub=(a,b)-> a-b;
     Calculator mul=(a,b)->a*b;
     Calculator divide = (a, b) -> b != 0 ? a / b : 0;

     System.out.println("Addition:"+add.calculate(5, 5));
     System.out.println("Substraction:"+sub.calculate(10, 5));
     System.out.println("Multiplication:"+mul.calculate(10, 5));
     System.out.println("Division:"+divide.calculate(10, 2));
    }
}