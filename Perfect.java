/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int sum = 0;
		for (int i = 1; i < number; i++) { 
			if ((number % i) == 0) { 
				sum += i;
			}
		}
		if (sum == number) {
			System.out.print(number + " is a perfect number since " + number + " = ");
			for (int i = 1 ; i < number; i++) { 
				int count = 0;
				if (number % i == 0) {
					count++;
					System.out.print(i); // 1 , 2 , 3
				}
				if (count < 2 ) {
					System.out.print( " + "); // " + " , " + "
				}
			}
		} else {
			System.out.println(number + " is not a perfect number");
		}
	}
}
