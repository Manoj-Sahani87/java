package Arrays;

import java.util.Scanner;

public class mutiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        int[][] arr2D = new int[3][3];

//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9}, // 2nd index -> arr2D[2] which is give me = {6, 7, 8, 9}
//        };

        // input
        for (int row = 0; row < arr2D.length; row++){
            // for each col in every row
            for (int col = 0; col < arr2D[row].length; col++){
                arr2D[row][col] = sc.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr2D.length; row++){
            // for each col in every row
            for (int col = 0; col < arr2D[row].length; col++){
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }
    }
}