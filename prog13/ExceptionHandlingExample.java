import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Division by zero example
        divideNumbers(10, 0);

        // Invalid mobile number example
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your mobile number: ");
            String userMobileNumber = scanner.nextLine();
            checkMobileNumberFormat(userMobileNumber);
            System.out.println("Mobile number is valid.");
            scanner.close();
        } catch (InvalidMobileNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    static void divideNumbers(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage() + ". Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    static void checkMobileNumberFormat(String mobileNumber) throws InvalidMobileNumberException {
        if (!mobileNumber.matches("\\d{10}")) {
            throw new InvalidMobileNumberException("Invalid mobile number format");
        }
    }
}

class InvalidMobileNumberException extends Exception {
    public InvalidMobileNumberException(String message) {
        super(message);
    }
}
