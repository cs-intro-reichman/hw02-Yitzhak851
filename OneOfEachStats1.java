public class OneOfEachStats1 {
	public static void main(String[] args) {
		int T, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		double p = Math.random();
		T = Integer.parseInt(args[0]);
		// run from 0 - T
		for (int i = 1; i <= T; i++) {
			// declrate + initional
			boolean itsAboy = false, itsAgirl = false;
			// count the num of children at every family
			int count = 0;
			while ((itsAgirl && itsAboy) == false) {
				if (p > 0.5) {
					itsAgirl = true;
				} else {
					itsAboy = true;
				}
				p = Math.random();
				count++;
			}
			if (count == 2) {
				sum2++;
			} else if (count == 3) {
				sum3++;
			} else if (count >= 4) {
				sum4++;
			}
			sum1 += count;
			count = 0;
		}
		double avg = sum1 / T;
		System.out.println("Average: " + (avg) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + sum2);
		System.out.println("Number of families with 3 children: " + sum3);
		System.out.println("Number of families with 4 children: " + sum4);
		if (sum2 > sum3) {
			System.out.println("The most common number of children is 2.");
		} else if (sum3 > sum4) {
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}