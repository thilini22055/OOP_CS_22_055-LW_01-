import java.util.Scanner;

public class Q2_LW_02 {

    
    public static int countDigits(int number) {
        
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative number to stop): ");
            int input = scanner.nextInt();

            if (input < 0) {
                System.out.println("Program terminated.");
                break;
            }

            int digits = countDigits(input);
            System.out.println(input + " has " + digits + " digit(s).");
        }

        scanner.close();
    }
}

