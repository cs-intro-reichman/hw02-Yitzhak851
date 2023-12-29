/**
 * This class contain a "Perfect" class.
 * 
 * @author (Yitzhak baror)
 * @version (29.12.2023)
 */
public class Perfect {
	public static void main(String[] args) {
		// declrate variables
		String perfectMessage, notperfectMessage;
		int number, sum;
		// initional variables
		number = Integer.parseInt(args[0]);
		sum = 0;
		perfectMessage = number + " is a perfect number since " + number + " = ";
		notperfectMessage = number + " is not a perfect number";
		// for loop- checking the sum of the integer divisor of the num
		for (int i = 1; i < number; i++) {
			if ((number % i) == 0) {
				sum += i;
			}
		}
		// checking - if sum==number - True=> print perfect otherwise print not
		if (sum == number) {
			perfectMessage += "1";
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					perfectMessage += " + " + i;
				}
			}
			System.out.print(perfectMessage);
		} else {
			System.out.println(notperfectMessage);
		}
	}
}