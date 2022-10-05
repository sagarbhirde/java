package core;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a = new Integer[30];

		for (int i = 1; i < a.length; i++) {

			Integer divisibleByThree = i % 3;
			Integer divisibleByFive = i % 5;
			if (divisibleByThree == 0) {
				System.out.println("three");
			}
			if (divisibleByFive == 0) {
				System.out.println("five");
			}
			if (divisibleByThree == 0 && divisibleByFive == 0) {
				System.out.println("three-five");
			} else {
				System.out.println("" + i);
			}
		}

	}

}
