/* You are taking an array A of N elements. You have to make all elements unique. To do so, in one step
you can increase any number by one. Find the minimum number of steps.

Example Input                   Example Output
Input 1:                        Output 1:
A = [1, 1, 3]                       1
Input 2:                        Output 2:
 A = [2, 4, 5]                       0                  */

import java.util.Scanner;
import java.util.ArrayList;
import  java.util.Collections;

public class MinSteps {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                A.add(num);
            }
            System.out.println("Minimum number of steps to make all elements unique: " + minStepsToMakeUnique(A));
        }
    }

    public static int minStepsToMakeUnique(ArrayList<Integer> A) {
        Collections.sort(A);
        int count = 0;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) <= A.get(i-1)) {
                count += A.get(i-1) - A.get(i) + 1;
                A.set(i, A.get(i-1) + 1);
            }
        }
        return count;
    }
}








