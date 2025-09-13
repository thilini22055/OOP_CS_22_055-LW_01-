import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner fullWord = new Scanner(System.in);

        System.out.println("Enter an odd length word: ");
        String word=fullWord.nextLine();

        if(word.length()%2==0){
            System.out.println("The word length is not odd");
        }
        else{
            int middleIndex=word.length()/2;
            char middleChar=word.charAt(middleIndex);
            System.out.println("MiddleCharacter:"+ middleChar);
        }
    }
}
