/* Taking an integer array A and return an 2D array B containing all the factorials of the ith element present in A as ith of B.
Input 1:                                                    Example Output
A = [4, 5,8, 9,12]                                          Output 1:
                                                          [[1,2,4],[1,5],[1,2,4,8], [1,3,9], [1,2,3,4,6,12]]
Example Explanation
Factorial of 4=1,2,4                            */

import java.util.ArrayList;
import java.util.Arrays;

public class FactorsArray {
    // Main method to generate the 2D array of factors
    public static ArrayList<ArrayList<Integer>> factorsArray(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        for (Integer integer : A) {
            ArrayList<Integer> factors = new ArrayList<>();
            int num = integer;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    factors.add(j);
                }
            }
            B.add(factors);
        }
        return B;
    }
    // Example usage
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 5, 8, 9, 12));
        ArrayList<ArrayList<Integer>> B = factorsArray(A);
        System.out.println(B);
    }
}
