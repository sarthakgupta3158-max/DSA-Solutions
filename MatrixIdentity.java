import java.util.Scanner;

public class MatrixIdentity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of matrices (rows cols):");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        System.out.println("Enter matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        boolean identical = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (A[i][j] != B[i][j]) {
                    identical = false;
                    break;
                }
            }
        }
        System.out.println(identical ? "Matrices are identical" : "Matrices are not identical");
    }
}