import java.util.Scanner; // Importing Scanner class for user input

public class inverted_half {

    // Function to print a pattern of numbers based on the given rows and columns
    static void inverted(int rows, int columns) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i && j <= columns; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Call the function to print the number pattern
        inverted(rows, columns);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
