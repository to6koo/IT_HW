import java.util.Scanner;

public class Task15 {
	//�� �� ������� ��������, ����� ������� ���������� ����� �� ���������
	//[0..24].
	//���������� �� ������ ������������� ��������� ��������� ���������
	//���.
	//��������� ��:
	//[18..4] - ����� �����; // �������� 18..6
	//[4..9] - ����� ����;	// �������� 6..11
	//[9..18] - ����� ���	// �������� 11..18
	//������: 10
	//�����: ����� ���
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert time(hour): ");
		double a = sc.nextDouble();
		if(a>=6 && a<11){
			System.out.println("Good Morning!");
		}
		if(a>=11 && a<18){
			System.out.println("Good Evening!");
		}
		if (a>=18 && a<24 || a>=0 && a<6) {
			System.out.println("Good Night!");
		}

	}

}
