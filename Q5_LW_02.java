import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5_LW_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");

       
        StringBuilder cleaned = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
           
            word = word.replaceAll("[^a-z0-9]", "");
            cleaned.append(word);
        }

       
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

