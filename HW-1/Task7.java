import java.util.Scanner;

public class Task7 {
	//�������� 3 ���������� �� ������������ � ��� (���������� ���), ����
	//���� (����� � ������� �������), ���� ��� ����� � ����� ���.
	//��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
	//������� �����:
	// - ��� ��� �����, ���� �� �������
	// - ��� ���� ����, �� �� ���� ���������
	// - ��� ����� � �� ���� ����� � �� ��� ���
	// - ��� ��� �����, �� ����� �� ���� � ��������
	//- ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
	//���������� ������� �������� ���� ��������� � ���������.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a hour: ");
	//	int time = sc.nextInt();
		System.out.print("Insert a money: ");
		double money = sc.nextDouble();
		System.out.print("Insert your healt: true/false: ");
		boolean healt = sc.nextBoolean();
		
		if(healt==false) {
			System.out.println("I didn't go anywhere");
		}
		if(healt==false && money>0){
			System.out.println("I will go to the pharmacy");
		}
		if(healt==false && money<=0){
		System.out.println("I will stay home and drink tea");
		}
		if(healt==true && money>=10){
			System.out.println("I will go to the cinema with my friedns");
		}
		if(healt==true && money<10){
			System.out.println("I will go to a restaurant to drink coffee");
		}

	}

}
