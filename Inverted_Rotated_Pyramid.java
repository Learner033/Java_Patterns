// Define a class named Inverted_Rotated_Pyramid
class Inverted_Rotated_Pyramid{
    // The main method, where the execution of the program begins
    public static void main(String[] args) {
        // Define the variable 'n' and initialize it with the value 4
        int n = 4;

        // Define variables 'rows' and 'columns' and initialize them with the value of 'n'
        int rows = n, columns = n;

        // Outer loop to iterate through each row
        for (int i = 1; i <= n; i++) {

            // Inner loop to print spaces before the asterisks
            for (int spaces = n - i; spaces >= 1; spaces--) {
                System.out.print(" "); // Print a space
            }

            // Inner loop to print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print an asterisk
            }

            // Move to the next line after completing each row
            System.out.println();
        }
    }
}
