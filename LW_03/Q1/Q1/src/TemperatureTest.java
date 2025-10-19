import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsiusValue = input.nextDouble();
        Temperature temp = new Temperature(celsiusValue);
        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());
        input.close();
    }
}

