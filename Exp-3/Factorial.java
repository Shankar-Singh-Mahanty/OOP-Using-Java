// WAP for static method that accepts data and returns the result.

public class Factorial {
    public static void main(String[] args)
    {
        int n = 8;
        int fact = factorial(n);
        System.out.println("The Factorial of "+n+" is "+fact);
    }
    public static int  factorial(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
