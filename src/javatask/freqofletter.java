package javatask;
import java.util.Scanner;

public class freqofletter {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Input word
	        System.out.print("Enter a word: ");
	        String word = sc.nextLine();

	        // Input letter to find frequency
	        System.out.print("Enter a letter to find its frequency: ");
	        char ch = sc.next().charAt(0);

	        int count = 0;

	        // Loop through word
	        for (int i = 0; i < word.length(); i++) {
	            if (word.charAt(i) == ch) {
	                count++;
	            }
	        }

	        System.out.println("Frequency of '" + ch + "' = " + count);

	        sc.close();
		

	}

}
