import java.util.Scanner;

public class Task13 {
	//�� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
	//���������� ����������� t � ������ ������.
	//�������������� ��������� ��:
	//��� -20 ������ �������;
	//����� 0 � -20 - �������;
	//����� 15 � 0 - ������;
	//����� 25 � 15 - �����;
	//��� 25 � ������.
	//������ �����: ���� ����� �� ��������� [-100..100].
	//������: 12
	//�����: ������

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter degrees in Celsius: ");
		double degrees = sc.nextDouble();
		System.out.println("Entered degrees in Celsius is "+degrees+" �C");
		if (degrees<=-20) {
			System.out.println("The temperature is very cold!");
			}
		if (degrees>-20 && degrees<=0 ) {
			System.out.println("The temperature is  cold!");
			}
		if (degrees>0 && degrees<=15 ) {
			System.out.println("The temperature is chilly!");
			}

		if (degrees>15 && degrees<=25) {
			System.out.println("The temperature is very warm!");
			}

		if (degrees>25) {
			System.out.println("The temperature is very hot!");
			}

		

	}

}
