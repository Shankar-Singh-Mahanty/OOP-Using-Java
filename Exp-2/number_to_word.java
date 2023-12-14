import java.util.*;

public class number_to_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            int rem = (num % 10);
            rev = (rev * 10) + rem;
            num /= 10;
        }
        int m;
        while(rev > 0){
            m = (rev % 10);
            switch(m){
                case 0:
                System.out.print("Zero ");
                break;
                case 1:
                System.out.print("one ");
                break;
                case 2:
                System.out.print("two ");
                break;
                case 3:
                System.out.print("three ");
                break;
                case 4:
                System.out.print("four ");
                break;
                case 5:
                System.out.print("five ");
                break;
                case 6:
                System.out.print("six ");
                break;
                case 7:
                System.out.print("seven ");
                break;
                case 8:
                System.out.print("eight ");
                break;
                case 9:
                System.out.print("nine ");
                break;
                default:
                System.out.println("xxx ");
                break;
            }
            rev /= 10;
        }
        sc.close();
    }
}