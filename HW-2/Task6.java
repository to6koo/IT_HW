import java.util.Scanner;

public class Task6 {
	//�� �� ������� ����� �� ������(���������) � �� ��
	//������ ����� �� ������ ����� ����� 1 � ���������� �����.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert � number: ");
		int a = sc.nextInt();
		int sum=0;
		for(int i=1, j=a; i<=j; i++){
			sum = sum +i;
			
		}
		System.out.println("Result is: "+sum);
	}

}
