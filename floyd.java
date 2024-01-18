public class floyd {

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Initialize a variable 'num' with the value 1.
        int num = 1;

        // Outer loop controls the number of rows in the pattern.
        for (int i = 1; i <= 5; i++) {
            // Inner loop controls the number of elements in each row.
            for (int j = 1; j <= i; j++) {
                // Print the value of 'num' followed by a space and increment 'num'.
                System.out.print((num++) + " ");
            }
            // Move to the next line after printing each row.
            System.out.println();
        }
    }
}
