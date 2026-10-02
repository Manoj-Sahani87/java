package Arrays;
// Take a matrix as input from the user.
// Search for a given number x and print the indices at which it occurs.
import java.util.Scanner;

public class TwoDArray_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size : ");
        int rows = sc.nextInt();
        System.out.print("Enter column size : ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (numbers[i][j] == x){
                    System.out.println("X found at location (" + i + ", " + j + ")");
                }
            }
        }
    }
}