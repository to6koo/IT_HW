import java.util.Scanner;

public class Task6 {
	//�������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
	//�� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
	//�3 �� ��� ������� �������� �� �1.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a1 number: ");
		int a1 = sc.nextInt();
		System.out.print("Insert a2 number: ");
		int a2 = sc.nextInt();
		System.out.print("Insert a3 number: ");
		int a3 = sc.nextInt();
		int newa1; 
		int newa2;
		int newa3;{
		newa1=a1;
		newa2=a2;
		newa3=a3;
		}
		a1=newa2;
		a2=newa3;
		a3=newa1;
		System.out.println("�xchanged a1 value: " +a1);
		System.out.println("�xchanged a2 value: " +a2);
		System.out.println("�xchanged a3 value: " +a3);

	}

}
