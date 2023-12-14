import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        if(num == 2){
            System.out.println("The number " + num + " is a prime number." );
        }
        else{
            int count = 0;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0)/* not (num % 2 == 0) */{
                count++;
            }
        }
        if(count > 0){
            System.out.println("The number " + num + " is not a prime number.");
        }
        else{
            System.out.println("The number " + num + " is a prime number.");
        }
        }
        sc.close();
    }
}
