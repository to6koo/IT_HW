package homework4;

public class Task7 {
	/*
	 * ����� ������������� �������� ��������� �� ���������� �����, �������� �
	 * ��������� ������� � ������� 6 ���� � 6 ������. �� �� ������� �������� ,
	 * ���� ����� �� ������ ������ �� ������ ��������, ����� ���� �� ������� ��
	 * ��� � ������ � ����� �����. ���������� �� ������� ����������� ���� ��
	 * ����� ������� ��� �� ����������� �������, ����� � ������ ���� �� ����
	 * ��������. �� �� �������� ���� ���� �����. ������: 11,12,13,14,15,16,
	 * 21,22,23,24,25,26, 31,32,33,34,35,36, 41,42,43,44,45,46,
	 * 51,52,53,54,55,56, 61,62,63,64,65,66 �����: 11, ,13, ,15, , ���� ��
	 * ���������� �� ����: 39 22, ,24, ,26, ���� �� ���������� �� ����: 72 31,
	 * ,33, ,35, , ���� �� ���������� �� ����: 99 42, ,44, ,46, ���� ��
	 * ���������� �� ����: 132 51, ,53, ,55, , ���� �� ���������� �� ����: 159
	 * 62, ,64, ,66 ���� �� ���������� �� ����: 192 ���� �� ����������: 693
	 */

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sumRows = 0;
		int sumAllRows = 0;
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				if ((col % 2) == 0 && (row % 2) == 0) {
					System.out.print(arr[row][col] + " ");
					sumRows = sumRows + arr[row][col];
				}
				if ((col % 2) != 0 && (row % 2) != 0) {
					System.out.print(arr[row][col] + " ");
					sumRows = sumRows + arr[row][col];

				}

			}
			System.out.print("Sum: " + sumRows);
			System.out.println();
			sumAllRows = sumAllRows + sumRows;
			sumRows = 0;
		}
		System.out.println("Sum of all Rows is: " + sumAllRows);
	}

}
