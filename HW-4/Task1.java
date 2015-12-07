package homework4;

public class Task1 {
	/*
	 * Изход: най-малко 13; най-голямо 95
	 */
	public static void main(String[] args) {

		int[][] a = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 }, { 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {

				if (a[row][col] > max) {
					max = a[row][col];
				}
				if (a[row][col] < min) {
					min = a[row][col];
				}
			}
		}
		System.out.println("Min element is : " + min);
		System.out.println("Max element is : " + max);
	}

}
