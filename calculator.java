package javatask;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Input numbers
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        // Input operator
	        System.out.print("Enter operator (+, -, *, /, %): ");
	        char op = sc.next().charAt(0);

	        int result = 0; // variable for result

	        switch (op) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result = " + result);
	                break;

	            case '-':
	                result = num1 - num2;
	                System.out.println("Result = " + result);
	                break;

	            case '*':
	                result = num1 * num2;
	                System.out.println("Result = " + result);
	                break;

	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result = " + result);
	                } else {
	                    System.out.println("Error: Division by zero not allowed!");
	                }
	                break;

	            case '%':
	                if (num2 != 0) {
	                    result = num1 % num2;
	                    System.out.println("Result = " + result);
	                } else {
	                    System.out.println("Error: Modulo by zero not allowed!");
	                }
	                break;

	            default:
	                System.out.println("Invalid operator!");
	        }

	        sc.close();

	}

}
