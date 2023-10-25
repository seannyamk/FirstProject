import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");
        System.out.print("Enter 'a': ");
        double a = scanner.nextDouble();


        if (a == 0) {
            System.out.println("The coefficient 'a' cannot be zero for a quadratic equation.");
            return;
        }

        System.out.print("Enter 'b': ");
        double b = scanner.nextDouble();
        System.out.print("Enter 'c': ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        switch (delta > 0 ? 2 : delta == 0 ? 1 : 0) {
            case 2:
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Two real roots:\n x1 = %.2f\n x2 = %.2f\n", x1, x2);
                break;
            case 1:
                double x = -b / (2 * a);
                System.out.printf("One real root:\n x = %.2f\n", x);
                break;
            case 0:
                System.out.println("No real roots (complex roots).");
                break;
        }

        scanner.close();
    }
}
