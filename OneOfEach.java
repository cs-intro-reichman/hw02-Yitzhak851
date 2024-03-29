/**
 * This class contain a "OneOfEach" class.
 * 
 * @author (Yitzhak baror)
 * @version (29.12.2023)
 */
public class OneOfEach {
	public static void main(String[] args) {
		boolean itsAboy = false, itsAgirl = false;
		int count = 0;
// logic- if not girl or boy print children 
		while ((itsAgirl && itsAboy) == false) { // #feedback - you can use !(itsAgirl && itsAboy) instead of comparing to false.
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
