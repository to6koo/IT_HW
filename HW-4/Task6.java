package homework4;

public class Task6 {
	/*
	 * Имате предварително въведени стойности от естествени числа. Числата са
	 * въведени в квадратна таблица с размери 6 реда и 6 колони. Да се състави
	 * програма, чрез която се намира сумата на всички елементи от редовете с
	 * четни номера: 2,4 и 6. Програмата да извежда и сумата на всеки отделен
	 * ред. Пример: 11,12,13,14,15,16, 21,22,23,24,25,26, 31,32,33,34,35,36,
	 * 41,42,43,44,45,46, 51,52,53,54,55,56, 61,62,63,64,65,66 Изход:
	 * 21,22,23,24,25,26 сума 141 41,42,43,44,45,46 сума 261 61,62,63,64,65,66
	 * сума 381 Сума на елементите 783
	 */
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };

		int sumRows = 0;
		int sumAllRows = 0;

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");

			}
			System.out.println();
		}
		System.out.println();
		for (int row = 0; row < arr.length; row++) {
			if ((row % 2) != 0) {
				for (int col = 0; col < arr[row].length; col++) {
					System.out.print(arr[row][col] + " ");
					sumRows = sumRows + arr[row][col];
				}
				System.out.println("Sum: " + sumRows);
			}
			sumAllRows = sumAllRows + sumRows;
			sumRows = 0;
		}
		System.out.println("Sum of all Even Rows is: " + sumAllRows);
	}

}
