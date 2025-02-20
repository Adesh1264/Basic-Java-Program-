import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of matrices (rows cols): ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int r2 = c1, c2 = sc.nextInt(); // Ensuring valid multiplication

        int[][] A = new int[r1][c1], B = new int[r2][c2], C = new int[r1][c2];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // Multiplication logic
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    C[i][j] += A[i][k] * B[k][j];

        // Display result
        System.out.println("Resultant Matrix:");
        for (int[] row : C) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        sc.close();
    }
}
