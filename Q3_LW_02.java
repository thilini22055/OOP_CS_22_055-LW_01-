import java.util.Scanner;

public class Q3_LW_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of rows
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars (2*i - 1 stars for row i)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }

        scanner.close();
    }
}
