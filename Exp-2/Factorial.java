import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int factorial = 1;
        
        if(num > 0) {
            int i =1;
            while(i <= num) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("The factorial of " + num + "! = " + factorial);
        }
        else {
            System.out.println("Please enter a valid input");
        }
        sc.close();
    }
}
