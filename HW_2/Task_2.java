package HW_2;
// К калькулятору из предыдущего дз добавить логирование.

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task_2.class.getName());
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Какую операцию будем выполнять?\nВведите символ/ы (+, -, /, //, %, *, **)\n");
        String operation = iScanner.nextLine().strip();
        FileHandler fh = new FileHandler("HW_2/log_2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info(operation);

        while (!(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("//") || operation.equals("%") || operation.equals("*") || operation.equals("**"))) {
            System.out.println("Некорректный ввод, попробуйте снова\nВведите символ/ы (+, -, /, //, %, *, **)\n");
            operation = iScanner.nextLine();
            logger.info(operation);
        }

        System.out.println("Введите первое число: ");
        float first_number = iScanner.nextFloat();
        logger.info(Float.toString(first_number));
        System.out.println("Введите второе число: ");
        float second_number = iScanner.nextFloat();
        logger.info(Float.toString(second_number));
        float result = 0;

        switch (operation) {
            case "+" -> {
                result = first_number + second_number;
                System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            }
            case "-" -> {
                result = first_number - second_number;
                System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            }
            case "/" -> {
                result = first_number / second_number;
                System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            }
            case "//" -> {
                int a, b;
                a = (int) first_number;
                b = (int) second_number;
                result = (float) a / b;
                System.out.printf(("%.2f %s %.2f = %.0f"), first_number, operation, second_number, result);
            }
            case "%" -> {
                int a, b;
                a = (int) first_number;
                b = (int) second_number;
                result = a % b;
                System.out.printf(("%.2f %s %.2f = %.0f"), first_number, operation, second_number, result);
            }
            case "*" -> {
                result = first_number * second_number;
                System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            }
            case "**" -> {
                double a, b;
                a = first_number;
                b = second_number;
                result = (float) Math.pow(a, b);
                System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            }
        }
        iScanner.close();
        logger.info((first_number) + " " + operation + " " + (second_number) + " " + "=" + " " + result);
    }
}