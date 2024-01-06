/**
 * This class contain a "InOrder" mission.
 * 
 * @author (Yitzhak baror)
 * @version (29.12.2023)
 */
public class InOrder {
	public static void main(String[] args) {
		int num1, num2, temp;
		num1 = (int) (Math.random() * 10);
		num2 = (int) (Math.random() * 10);
		System.out.print(num1 + " ");

		while (num1 <= num2) {
			System.out.print(num2 + " ");
			// #feedback - note that this "if" is redundant since if we are here, num2 must be greater than (or equal to) num1.
			if (num2 >= num1) {
				num1 = num2;
				temp = (int) (Math.random() * 10); // #feedback - you can set the value directly to num2 without using a temp variable.
				num2 = temp;
			}
		}
	}
}
