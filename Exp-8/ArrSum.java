/* Taking a matrix A, you have to return an array containing sum of each row elements
followed by sum of each column elements of the matrix.

Example Input                                               Example Output
Input 1:                                                    Output 1:
A = [[1, 2],[4, 5],[8, 9]]                                  [3, 9, 17, 13, 16]

Example Explanation:-
Row 1 elements sum = 1 + 2 = 3.
Row 2 elements sum = 4 + 5 = 9.
Row 3 elements sum = 8 + 9 = 17.
Column 1 elements sum = 1 + 4 + 8 = 13.
Column 2 elements sum = 2 + 5 + 9 = 16.                        */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArrSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            List<List<Integer>> A = new ArrayList<>();
            System.out.println("Enter the matrix elements (row wise):");
            for (int i = 0; i < rows; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < cols; j++) {
                    row.add(sc.nextInt());
                }
                A.add(row);
            }

            List<Integer> result = rowColumnSum(A);
            System.out.println(result);
        }
    }

    public static List<Integer> rowColumnSum(List<List<Integer>> A) {
        List<Integer> result = new ArrayList<>();
        int rowSum = 0;
        for (List<Integer> row : A) {           // enhanced for or for-each loop
            for (Integer integer : row) {
                rowSum += integer;
            }
            result.add(rowSum);
            rowSum = 0;
        }
        int colSum = 0;
        for (int j = 0; j < A.get(0).size(); j++) {
            for (List<Integer> integers : A) {
                colSum += integers.get(j);
            }
            result.add(colSum);
            colSum = 0;
        }
        return result;
    }
}
