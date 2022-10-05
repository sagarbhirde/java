package core.arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstArray = { 1, 2, 3, 5, 7 };
		int[] secondArray = { 2, 4, 6, 8,9,10 };
		int totalLength = firstArray.length + secondArray.length;
		int[] thirdArray = new int[totalLength];

		int firstArrayLength = firstArray.length;
		int firstCursor = 0;
		int secondCursor = 0;
		for (int i = 0; i < totalLength; i++) {
			if (firstArrayLength != firstCursor && firstArray[firstCursor] < secondArray[secondCursor]) {
				thirdArray[i] = firstArray[firstCursor];
				firstCursor++;
			} else {
				thirdArray[i] = secondArray[secondCursor];
				secondCursor++;
			}
			System.out.println(thirdArray[i]);
		}
	}

}
