package javatask;

public class evenoddbet1to100 {

	public static void main(String[] args) {
		int evenSum = 0;
        int oddSum = 0;

        int num = 1;

        // Using while + if logic
        while (num <= 100) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            num++;
        }

        System.out.println("Sum of Even numbers from 1 to 100 = " + evenSum);
        System.out.println("Sum of Odd numbers from 1 to 100 = " + oddSum);

	}

}
