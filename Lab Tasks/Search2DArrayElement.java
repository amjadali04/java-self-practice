import java.util.Scanner;

public class Search2DArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be greater than zero.");
            sc.close();
            return;
        }

        int[][] numbers = new int[rows][cols];

        // Input elements into the 2D array.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                numbers[i][j] = sc.nextInt();
            }
        }

        // Display the 2D array.
        System.out.println("\nYour 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter an element to search: ");
        int target = sc.nextInt();
        boolean found = false;

        // Search for the target and display every matching position.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == target) {
                    System.out.println("Found at [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
