public class Reverse {
	public static void main(String[] args) {
		// Declrate variables
		String word = args[0];
		int word_length = word.length();
		int middle_index = 0;
		// continnoal
		if (word_length == 0) {
			System.out.println("");
		} else if (word_length % 2 == 0) {
			middle_index = (word_length / 2) ;
		} else if (word_length % 2 != 0) {
			middle_index = (word_length / 2) + 1;
		}

		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
		
		System.out.println("The middle character is " + word.charAt(middle_index));
	}
}