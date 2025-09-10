package javatask;
import java.util.Scanner;

public class posineg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is Positive");
        }

        if (num < 0) {
            System.out.println(num + " is Negative");
        }

        if (num == 0) {
            System.out.println("The number is Zero");
        }

        sc.close();

	}

}
