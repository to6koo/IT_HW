package homework4;

public class Task2 {
	/*
	 * Имате квадратен двумерен масив от естествени числа, чийто стойности се
	 * въвеждат. Да се отпечатат диагоналите на масива. Пример: 1,4,6,3 5,9,7,2
	 * 4,8,1,9 2,3,4,5 Изход: 1 9 1 5 3 7 8 2
	 */
	public static void main(String[] args) {
		int[][] a = { { 1, 4, 6, 3 },
					  { 5, 9, 7, 2 }, 
					  { 4, 8, 1, 9 }, 
					  { 2, 3, 4, 5 } };
		for (int row = 0; row < a.length; row++) {
			System.out.print(a[row][row]);
			
		}
		System.out.println();
		for (int row = 0; row < a.length; row++) {
			System.out.print(a[row][a.length-1-row]);
		}
		
	}
}
