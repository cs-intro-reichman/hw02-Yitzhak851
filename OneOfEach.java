/**
 * Simulates the formation of a family in which the parents decide
 * to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main(String[] args) {
		boolean itsAboy = false;
		boolean itsAgirl = false;
		int count = 0;
		double rnd = Math.random();
		
		while ((itsAgirl && itsAboy) == false) {
			if (rnd > 0.5) {
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