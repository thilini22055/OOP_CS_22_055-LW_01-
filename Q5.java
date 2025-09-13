import java.util.Scanner;
class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double computeArea() {
        return Math.PI * radius * radius;
    }

    double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}


public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inner radius: ");
        double ri = sc.nextDouble();

        System.out.print("Enter outer radius: ");
        double ro = sc.nextDouble();

        Circle inner = new Circle(ri);
        Circle outer = new Circle(ro);

        double shadedArea = outer.computeArea() - inner.computeArea();

        System.out.println("Shaded area = " + shadedArea);
    }
}
