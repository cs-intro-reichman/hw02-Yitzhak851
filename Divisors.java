/**
 * This class contain a "Divisors" mission.
 * 
 * @author (Yitzhak baror)
 * @version (29.12.2023)
 */
public class Divisors {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		for (int i = 1; i <= x; i++) {
			if ((x % i) == 0) {
				System.out.println(i);
			}
		}
	}
}
