
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MyJava Lo-Fat Burgers Menu ===");
        System.out.println("Entrees:");
        System.out.println("1. Tofu Burger - $3.49");
        System.out.println("2. Cajun Chicken - $4.59");
        System.out.println("3. Buffalo Wings - $3.99");
        System.out.println("4. Rainbow Fillet - $2.99");

        System.out.println("\nSide Dishes:");
        System.out.println("1. Rice Cracker - $0.79");
        System.out.println("2. No-Salt Fries - $0.69");
        System.out.println("3. Zucchini - $1.09");
        System.out.println("4. Brown Rice - $0.59");

        System.out.println("\nDrinks:");
        System.out.println("1. Cafe Mocha - $1.99");
        System.out.println("2. Cafe Latte - $1.90");
        System.out.println("3. Espresso - $2.49");
        System.out.println("4. Oolong Tea - $0.99");

        double total = 0;

        System.out.print("\nSelect entree (1-4): ");
        int entree = scanner.nextInt();
        switch (entree) {
            case 1: total += 3.49; break;
            case 2: total += 4.59; break;
            case 3: total += 3.99; break;
            case 4: total += 2.99; break;
        }

        System.out.print("Select side dish (1-4): ");
        int side = scanner.nextInt();
        switch (side) {
            case 1: total += 0.79; break;
            case 2: total += 0.69; break;
            case 3: total += 1.09; break;
            case 4: total += 0.59; break;
        }

        System.out.print("Select drink (1-4): ");
        int drink = scanner.nextInt();
        switch (drink) {
            case 1: total += 1.99; break;
            case 2: total += 1.90; break;
            case 3: total += 2.49; break;
            case 4: total += 0.99; break;
        }

        System.out.printf("Total: $%.2f\n", total);
    }
}
