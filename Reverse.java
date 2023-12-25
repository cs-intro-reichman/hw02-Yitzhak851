public class Reverse {
	public static void main(String[] args) {
		String word = args[0];
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
		int middleIndex;
		if ((word.length() % 2) == 0) {
			middleIndex = (word.length() / 2) - 1;
		} else {
			middleIndex = (word.length() / 2);
		}
		
		System.out.println("The middle character is " + word.charAt(middleIndex));
	}
}