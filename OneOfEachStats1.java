public class OneOfEachStats1 {
	public static void main(String[] args) {
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
		System.out.print("You made it... and you now have "+ count + " children.");
	}
}