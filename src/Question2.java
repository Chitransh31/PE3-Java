import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter no. of rows: ");
            int numRows = in.nextInt();
            System.out.println("Enter no. of columns: ");
            int numCols = in.nextInt();

            int[][] firstMatrix = new int[numRows][numCols];
            int secondMatrixElement;

            System.out.println("Enter 1st matrix:");
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    firstMatrix[i][j] = in.nextInt();
                }
            }

            System.out.println("Enter 2nd matrix:");
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    secondMatrixElement = in.nextInt();
                    firstMatrix[i][j] += secondMatrixElement;
                    System.out.print(firstMatrix[i][j]+ " ");
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            System.out.println("Invalid input!");
        }

    }
}
