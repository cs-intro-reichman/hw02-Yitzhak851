/**
 * This class contain a "DamkaBoard" mission.
 * 
 * @author (Yitzhak baror)
 * @version (28.12.2023)
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// getting args from the user
		int n = Integer.parseInt(args[0]);
		// logic - run from:  0-> n
		// if even - " " at the end, else, at the beggining
		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				for (int j = 0; j < n; j++) {
					System.out.print(" *");
				}
			} else {
				for (int j = 0; j < n; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
