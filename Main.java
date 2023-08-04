import java.util.Scanner;



    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String continueCalculating = "yes";

            do {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                System.out.print("Enter the operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double result = 0.0;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed!");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator. Please try again.");
                        continue;
                }

                System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

                System.out.print("Do you want to do another operation? (yes/no): ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("no")) {
                    continueCalculating = "no";
                }

            } while (continueCalculating == "yes");

            System.out.println("Exit");
            scanner.close();
}
}