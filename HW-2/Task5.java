import java.util.Scanner;

public class Task5 {
	/* �� �� ������� �� ����������� 2 �����. � �� ��
	 ������� �� ������ ������ ����� �� ��-������� �� ��-��������.
*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first  number: ");
		int a = sc.nextInt();
		System.out.print("Insert second  number: ");
		int b = sc.nextInt();
		for(int i=a, j=b; i<=j; i++){
			System.out.print(i+" ");
		}
		
	}

}
