import java.util.Scanner;
import static java.lang.System.*;
public class calc {
    public static void main(String[] args) {
        out.println("Simple Calculator");
        float a, b;
        char operation;
        Scanner scanner = new Scanner(in);
        out.println("Enter the a");
        a = scanner.nextFloat();
        out.println("Enter the b");
        b = scanner.nextFloat();
        out.println("Enter the operation");
        operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                out.println(a + b);
                break;

            case '-':
                out.println(a - b);
                break;

            case '*':
                out.println(a * b);
                break;
            case '/':
                out.println(a / b);
                break;
            case '%':
                out.println(a % b);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }

    }
}