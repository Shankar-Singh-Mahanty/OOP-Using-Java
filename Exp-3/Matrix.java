// WAP to take 2D array and print the elements in the forms of a matrix.

import java.util.Scanner;
public class Matrix {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int matrix[][]= new int[3][3];
        System.out.println("Enter the elements of the matrix:-");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {   // Magic of plus(+) operator
                System.out.print("["+(i+1)+""+(j+1)+"]th position= ");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Elements in Matrix format are :-");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("\t"+matrix[i][j]);

            }
            System.out.println();
        }
    }
}
