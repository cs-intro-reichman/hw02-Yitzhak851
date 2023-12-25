import java.util.Random;

public class OneOfEachStats1 {
	public static void main(String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
		Random generator = new Random(seed);
		boolean itsAboy = false;
		boolean itsAgirl = false;
		int count = 0;
		while ((itsAgirl && itsAboy) == false) {
			if (Math.random() > 0.5) {
				System.out.print("g ");
				itsAgirl = true;
			} else {
				System.out.print("b ");
				itsAboy = true;
			}
			count++;
		}
		System.out.println();
		System.out.print("You made it... and you now have " + count + " children.");
	}
}