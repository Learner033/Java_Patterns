public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 4, columns = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {
                // Check if the current position is on the boundary
                if (i == 1 || j == 1 || i == rows || j == columns) {
                    // Print '*' if on the boundary
                    System.out.print("*");
                } else {
                    // Print a space if not on the boundary
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}

