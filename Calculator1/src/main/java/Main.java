

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();

        out.print("Введите число 1");
        double first = input.number();

        out.print("Введите операцию");
        char operation = input.operation();

        out.print("Введите число 2");
        double second = input.number();

        Calculator calculator = new Calculator(first, second);
        // '+', '-', '*', '/'

        switch (operation) {
            case '+': calculator.add(); break;
            case '-': calculator.substract(); break;
            case '/': calculator.multiply(); break;
            case '*': calculator.divide(); break;


            double result = calculator.result();

            out.print("Результат = " + result);
        }
    }
}
