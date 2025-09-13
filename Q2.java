import java.util.Scanner;
public class Q2 {
        public static void main(String[] args) {
            Scanner fullName = new Scanner(System.in);

            System.out.print("Enter the first name:");
            String firstName=fullName.nextLine();

            System.out.print("Enter the middle name:");
            String middleName=fullName.nextLine();

            System.out.print("Enter the last name:");
            String lastName=fullName.nextLine();

            char middleInitial=middleName.charAt(0);

            System.out.print("The name is:"+lastName + ","+firstName+" "+ middleInitial+".");
        }
    }


