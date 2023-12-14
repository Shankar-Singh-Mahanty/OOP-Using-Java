import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Availabe operations are: ");
        System.out.println("Addition(+), Subtraction(-), Multiplication(x) and Division(/)");
        System.out.println("Enter two numbers to perform operations: ");
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();
        System.out.print("Enter the operation you want to perform: ");
        char o = sc.next().charAt(0);
        switch(o){
            case '+':
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            break;
            case '-':
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            break;
            case 'x':
            System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
            break;
            case '/':
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
            break;
            default:
            System.out.println("Please enter a valid operation.");
            break;
        }
        sc.close();
    }
}


