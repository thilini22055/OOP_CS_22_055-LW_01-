import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5_LW_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Tokenize sentence into words (split by space)
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");

        // Build a cleaned version: only lowercase letters/numbers, no punctuation
        StringBuilder cleaned = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            // Remove punctuation characters from each word
            word = word.replaceAll("[^a-z0-9]", "");
            cleaned.append(word);
        }

        // Check palindrome
        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();

        if (cleanedStr.equals(reversedStr)) {
            System.out.println("The sentence IS a palindrome.");
        } else {
            System.out.println("The sentence is NOT a palindrome.");
        }

        scanner.close();
    }
}
