
import java.util.Scanner;

public class Main {
    public static int countDigits(int number) {
        if (number == 0) return 1;

        int count = 0;
        int n = Math.abs(number);

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            System.out.println("Number of digits: " + countDigits(num));
        }
    }
}
