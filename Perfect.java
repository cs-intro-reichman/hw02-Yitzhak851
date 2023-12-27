/**
 * Gets a command-line argument (int), and chekcs if the given number is
 * perfect.
 */
public class Perfect {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]); // get 6 or 8
		int sum = 0;
		String str;
		for (int i = 1; i < number; i++) { 
			if ((number % i) == 0) { 
				str = "" + i;
				sum += i;
			}
		}
		
		// string str - if sum==number - loop - init the divisors to str 

		if (sum == number) {
			System.out.print(number + " is a perfect number since " + number + " = ");
			for (int i = 1 ; i < number; i++) { 
				int count = 0;
				if (number % i == 0) {
					count++;
					System.out.print(i); // 1 , 2 , 3
				}
			}
		} else {
			System.out.println(number + " is not a perfect number");
		}
		System.out.println();
	}
}
