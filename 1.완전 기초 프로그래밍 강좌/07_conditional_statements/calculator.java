import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("What operation do you want to perform? ");
        String operation = scanner.nextLine();

        if (operation.toLowerCase().equals("sum")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.toLowerCase().equals("sub")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        } else if (operation.toLowerCase().equals("mul")) {
            System.out.printf("%f x %f = %f", number1, number2, number1 * number2);
        } else if (operation.toLowerCase().equals("div")) {
            if (number2 == 0) {
                System.out.printf("can not divide by zero.");
            } else {
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
        } else {
            System.out.printf("%s is not a supported operation.", operation);
        }

        scanner.close();
    }
}