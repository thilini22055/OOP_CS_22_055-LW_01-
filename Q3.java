import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {

        Scanner centi=new Scanner(System.in);

        System.out.print("Enter the centimetres:");
        int centiMi=centi.nextInt();

        double inches=centiMi/2.54;
        int feet=(int)inches/12;
        inches=inches%12;

        System.out.print("The centimetres convert: inches is:"+inches+"  "+"feet is:"+feet);;

    }
}
