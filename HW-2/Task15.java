import java.util.Scanner;

public class Task15 {
	/*�� �� ������� ��������, ����� �� ������� ������ ��
	������ ����� �� 1 �� �������� ����� N.
	������: 5
	�����: 15
	����������� ����� do-while.*/
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert � number: ");
		int a = sc.nextInt();
		int sum=0;
		int i=0;
		do{
			sum = sum+i;
			i++;
		}
		while(i<=a);
		System.out.println(sum);
		
		/*for (int i=1 ;i <= n; ++i)
	      {
	         sum *=i;
	      }*/

		
		
	}

}
