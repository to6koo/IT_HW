import java.util.Scanner;

public class Task1 {

//	�� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
//	������������ A � B (���� �� �� � ������� ������� � double).
//	����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
//	�� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first (A) number: ");
		int a = sc.nextInt();
		System.out.print("Insert second (B) number: ");
		int b = sc.nextInt();
		System.out.print("Insert third (C) number: ");
		int c = sc.nextInt();
		if (c>a && c<b) {
			System.out.println("The third (C) numbers is between A and B");
		}else{
			System.out.println("The third (C) number isn't between A and B");
		}

	}

}
