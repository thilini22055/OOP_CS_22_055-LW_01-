

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = scanner.next();

        System.out.print("Enter replacement word: ");
        String newWord = scanner.next();

        String result = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);

        System.out.println("Modified sentence: " + result);
    }
}
