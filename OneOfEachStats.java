public class OneOfEachStats {
	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		for (int i = 0; i < T; i++) {
			boolean itsAboy = false, itsAgirl = false;
			int count = 0;
			while ((itsAgirl && itsAboy) == false) {
				if (Math.random() > 0.5) {
					itsAgirl = true;
				} else {
					itsAboy = true;
				}
				count++;
			}
			if (count == 2) {
				sum2++;
			} else if (count == 3) {
				sum3++;
			} else if (count >= 4) {
				sum4++;
			}
			sum1 = (sum1 + count);
		}
		double numOfFamily = T;
		System.out.println("Average: " + sum1 / numOfFamily + " children to get at least one of each gender.");
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