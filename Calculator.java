import java.io.IOException;
import java.util.Scanner;

/**
 * Calculator
 * @author 汪喆昊 516030910460
 * @version 0.0.1
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.print("Java Calculator implemented by 516030910460.\nPress q to quit the program.\n$ ");

        Scanner in = new Scanner(System.in);
        String exp = in.next();
        while (!"q".equals(exp)) {
            try {
                System.out.println(calculate(exp));
            } catch (Exception e) {
                System.out.print("Error.");
            }
            System.out.print("$ ");
            exp = in.next();
        }
        in.close();
    }

    static int calculate(String exp) {
        return 0;
    }
}

class WrongInputException extends IOException {
    public WrongInputException() {}

}