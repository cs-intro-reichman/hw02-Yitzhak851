/**
 * This class contain a "OneOfEachStats" class.
 * 
 * @author (Yitzhak baror)
 * @version (29.12.2023)
 */
import java.util.Random;

public class OneOfEachStats {
	public static void main(String[] args) {
		int T, seed, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		double p;
		// get from the user T and seed
		T = Integer.parseInt(args[0]);
		seed = Integer.parseInt(args[1]);
		// initional
		Random generator = new Random(seed);
		// run from 0 - T
		for (int i = 1; i <= T; i++) {
			boolean itsAboy = false, itsAgirl = false;
			int count = 0;
			// logic - while we dont have boy or girl- continue try 
			// (and count how many children in my family)
			while ((itsAgirl && itsAboy) == false) {
				p = generator.nextDouble();
				if (p > 0.5) {
					itsAgirl = true;
				} else {
					itsAboy = true;
				}
				count++;
			}
			// count how many families have 2,3,4 or more children
			if (count == 2) {
				sum2++;
			} else if (count == 3) {
				sum3++;
			} else if (count >= 4) {
				sum4++;
			}
			sum1 += count;
		}
		// print the results
		double avg = (double) sum1 / (double) T;
		System.out.println("Average: " + (avg) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + sum2);
		System.out.println("Number of families with 3 children: " + sum3);
		System.out.println("Number of families with 4 or more children: " + sum4);
		// print the most common number of children
		if (sum2 > sum3) {
			System.out.println("The most common number of children is 2.");
		} else if (sum3 > sum4) {
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}