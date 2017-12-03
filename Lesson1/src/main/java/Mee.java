import java.util.Scanner;

public class Mee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Первое нумерное значение:");
        double a = sc.nextDouble(); //ввод первого значения
        sc.nextLine();

        System.out.println("Ввод операции ( + ; - ; * ; / ; sqrt:");
        String z = sc.nextLine(); //ввод операции

 /*Если пользователь ввел операцию сложения, то складывается переменная a и b, которые были введены ранее. Если нет, то проверяем дальше*/
        if (z.contains("+")) {
            System.out.println("Второе нумерное значение:");
            double b = sc.nextDouble(); //ввод второго значения
            sc.nextLine();
            double k = (a + b);
            System.out.print(a + " + " + b + " = ");
            System.out.printf("%.4f", k);

/*Если пользователь ввел операцию вычитания, то из переменной a вычитаетс переменная b, которые были введены ранее. Если нет, то проверяем дальше*/
        } else if (z.contains("-")) {
            System.out.println("Второе значение:");
            double b = sc.nextDouble();
            sc.nextLine();
            double k = (a - b);
            System.out.print(a + " - " + b + " = ");
            System.out.printf("%.4f", k);

/*Если пользователь ввел операцию умножения, то из переменная a умножается на  переменную b, которые были введены ранее. Если нет, то проверяем дальше*/
        } else if (z.contains("*")) {
            System.out.println("Второе значение:");
            double b = sc.nextDouble();
            sc.nextLine();
            double k = (a * b);
            System.out.print(a + " * " + b + " = ");
            System.out.printf("%.4f", k);


        }
/*Если пользователь ввел операцию корня, то вычитается корень из первого введенного значения (переменная а). Если нет, то проверяем дальше*/
        else if (z.contains("sqrt")) {
            System.out.print("Равно: ");
            System.out.printf("sqrt(%.4f) = %.4f%n", a, Math.sqrt(a));


        }

/*Если пользователь ввел операцию деления, то из переменная a делится на переменную b, которые были введены ранее. Если нет, то проверяем дальше*/

        else if (z.contains("/")) {
            System.out.println("Второе значение:");
            double b = sc.nextDouble();
            sc.nextLine();

            if (b == 0) {                   //пробуем поделить на ноль.
                System.out.print(a + " / " + b + " = ");
                System.out.printf("%.4f", a); //значение будет выведено, но...
                System.out.print(" , но так-то на ноль делить нельзя (:"); //...будет предупреждение что так делать не стоит.


            }
            else if (b != 0) { //а это, в случае если человек не хочет рисковать и поделить на нормальное число.
                double k = (a / b);
                System.out.print(a + " - " + b + " = ");
                System.out.printf("%.4f", k);

            }
        }
/*Если пользователь ввел операцию, которая не предусмотрена, то выдается сообщение что операция была введена неверно. */

        else {
            System.out.println("Неправильный ввод операции, используйте символы + - / *. Для вычисления корня используйте sqrt");

        }


        sc.close();
    }
}
