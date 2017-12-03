/**
 * @Author Alexander Panchneko
 * @see #main
 *
 */

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("*** ЭЛЕКТРОННЫЙ АРИФМОМЕТР ***");
        System.out.println();
        Scanner scanner = new Scanner(System.in);                             // инициализация сканнера

        System.out.print("Введи первое число. Затем, нажми Enter:");
        double a = scanner.nextDouble();                                      // ввод первого числа, а
        scanner.nextLine();                                                   // поглощение знака \n и ожидание новой строки
        System.out.println();

        System.out.println("Введи одно из арифметических действий: \"+\", \"-\", \"/\", \"*\". Затем, нажми Enter:");
        System.out.println();
        String z = scanner.next();                                            // ввод арифметического действия

        System.out.print("Введи второе число. Затем, нажми Enter:");
        double b = scanner.nextDouble();                                       // ввод второго числа, b
        scanner.nextLine();                                                    // поглощение знака \n и ожидание новой строки
        scanner.close();                                                       // завершение сканнера

        if (z.equals("+")) {double c = a + b; System.out.printf("%.4f", c);}    // вычитывание арифметических действий
        if (z.equals("-")) {double c = a - b; System.out.printf("%.4f", c);}
        if (z.equals("*")) {double c = a * b; System.out.printf("%.4f", c);}
        if (z.equals("/")) {
            if (b == 0) System.out.println("На ноль деление не производится");  // проверка деления на ноль
            if (b != 0) {double c = a / b; System.out.printf("%.4f", c);}
        }


    }
}
