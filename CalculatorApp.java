import java.util.Scanner;

class CalculatorApp {

    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("\n1 Add");
            System.out.println("2 Subtract");
            System.out.println("3 Multiply");
            System.out.println("4 Divide");
            System.out.println("5 Exit");

            System.out.print("Choose option: ");
            option = sc.nextInt();

            if (option >= 1 && option <= 4) {
                System.out.print("Enter two numbers: ");
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                double ans = 0;

                if (option == 1) ans = add(x, y);
                else if (option == 2) ans = sub(x, y);
                else if (option == 3) ans = mul(x, y);
                else if (option == 4) ans = div(x, y);

                System.out.println("Answer: " + ans);
            }
        }

        sc.close();
    }
}