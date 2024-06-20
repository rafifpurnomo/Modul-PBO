/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duamatrix;

import java.util.Scanner;

/**
 *
 * @author Muhammad Rafif A.P
 */
public class DuaMatrix {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Perkalian Matriks nxn\nn: ");
        int n = scanner.nextInt();

        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] result = new int[n][n];

        System.out.println("Isi matrix 1:");
        fillMatrix(matrix1, scanner);

        System.out.println("Isi matrix 2:");
        fillMatrix(matrix2, scanner);

        multiplyMatrices(matrix1, matrix2, result);

        System.out.println("Hasil perkalian:");
        printMatrix(result);
    }

    public static void fillMatrix(int[][] matrix, Scanner scanner) {
    for (int[] matrix1 : matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix1[j] = scanner.nextInt();
        }
    }
    }

    public static void multiplyMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
        int n = matrix1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
