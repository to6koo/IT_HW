import java.util.Scanner;

public class Task18 {

	/*�� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
	��������� [1..9].
	���������� �� ������� ��������� �� ���������.
	������������ �������� �� ����������� � ���������� �� 2-��
	�����*/
	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n, m;
	      do{
	         System.out.print("Insert n number:");
	         n = sc.nextInt();
	      }while(n < 1 || n > 9);

	      do{
	         System.out.print("Insert m number:");
	         m = sc.nextInt();
	      }while(m< 1 || m > 9);

	      for (int i = 1; i <= n; ++i) {
	         for(int j = 1; j <= m; ++j) {
	            System.out.println(i + " * " + j + " = " + i*j);
	         }
	      }
	   }

}
