import java.util.*;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();

        int strLength = str.length();
        String rev = "";
        for(int i=(strLength-1); i>=0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println(str + " is a pallindrome string.");
        }
        else{
            System.out.println(str + " is not a palindrome string.");
        }
        sc.close();
    }
}
