package Arrays;

import java.util.Scanner;

public class TwoDArray_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size : ");
        int row = sc.nextInt();
        System.out.print("Enter columns size : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[row][cols];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}