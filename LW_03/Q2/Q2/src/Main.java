import java.util.Scanner;

class Temperature {
    private double celsius;

    public Temperature() {
        this.celsius = 0.0;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    public double getCelsius() {
        return this.celsius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        Temperature temp = new Temperature();
        temp.setFahrenheit(fahrenheit);

        System.out.println("Temperature in Celsius: " + temp.getCelsius());
    }
}


