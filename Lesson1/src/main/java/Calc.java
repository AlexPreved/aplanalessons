
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("*** ЭЛЕКТРОННЫЙ АРИФМОМЕТР ***");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи первое число. Затем, нажми Enter:");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        System.out.println("Введи одно из арифметических действий: \"+\", \"-\", \"/\", \"*\". Затем, нажми Enter:");
        System.out.println();
        String z = scanner.next();

        System.out.print("Введи второе число. Затем, нажми Enter:");
        double b = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();

        if (z.equals("+")) {double c = a + b; System.out.printf("%.4f", c);}
        if (z.equals("-")) {double c = a - b; System.out.printf("%.4f", c);}
        if (z.equals("*")) {double c = a * b; System.out.printf("%.4f", c);}
        if (z.equals("/")) {
            if (b == 0) System.out.println("На ноль деление не производится");
            if (b != 0) {double c = a / b; System.out.printf("%.4f", c);}
        }


    }
}
