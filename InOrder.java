public class InOrder {
	public static void main(String[] args) {
		int num1, num2, temp;
		num1 = (int) (Math.random() * 10);
		num2 = (int) (Math.random() * 10);
		System.out.print(num1 + " ");

		while (num1 <= num2) {
			System.out.print(num2 + " ");
			if (num2 >= num1) {
				num1 = num2;
				temp = (int) (Math.random() * 10);
				num2 = temp;
			}
		}
	}
}