package homework3;

public class Task5 {
	/*
	 * �������� ��������, ����� ������� ����� � 10 �������� � ������������ �����
	 * �� ���������� ��� �������� ����� �� ������� �� �������� ������� �� 3. ��
	 * �� ������� ���������� �� ������.
	 */
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int index = 0; index < array.length; index++) {
			array[index] = index*3;
			System.out.print(array[index] + " ");
		}
	}
}
