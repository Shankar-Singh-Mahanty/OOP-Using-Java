/* Taking an integer A in the function parameter.
Return a 2D array with A rows such that the i-th row has numbers from 1 to i.

Example Input                       Example Output
Input 1:                            Output 1:
A = 3                               [[1], [1, 2], [1, 2, 3]]
Input 2:                            Output 2:
A = 4                               [[1], [1, 2], [1, 2, 3], [1, 2, 3, 4]]              */

import java.util.ArrayList;
import java.util.Scanner;

public class Arr2D {
    public static ArrayList<ArrayList<Integer>> CreateTable(int A) {
        var table = new ArrayList<ArrayList<Integer>>();
        for (int i = 1; i <= A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                row.add(j);
            }
            table.add(row);
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer A: ");
        int A = sc.nextInt();
        sc.close();
        ArrayList<ArrayList<Integer>> table = CreateTable(A);
        System.out.println(table);
    }
}





