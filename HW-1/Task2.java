import java.util.Scanner;

public class Task2 {
//	�������� 2 �������� ����������� ����� �� ���������. ��������
//	������� ����, �������, ������������, ������� �� ������� �
//	����������� ������� � ������� ���������� � ������������ ����
//	��������� � ���������. �������� ������ � ����� � ������� �������.

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first number: ");
		int first = sc.nextInt();
		System.out.print("Insert second number: ");
		int second = sc.nextInt();{
		System.out.println("����: "+(first+second));
		System.out.println("�������: "+(first-second));
		System.out.println("������������: "+(first*second));
		System.out.println("������� �� �������: "+(first%second));
		System.out.println("����������� �������: "+(first/second));
		}
		System.out.println("");
		System.out.print("Insert first number: ");  //����� �� ���������, ������ �����
		double a= sc.nextDouble();
		System.out.print("Insert second number: "); //����� �� ���������, ������ �����
		double b= sc.nextDouble();
		System.out.println("����: "+(a+b));
		System.out.println("�������: "+(a-b));
		System.out.println("������������: "+(a*b));
		System.out.println("������� �� �������: "+(a%b));
		System.out.println("����������� �������: "+(a/b));
	}

}
