import java.util.Scanner;

public class Task22 {
	/*�� �� ������� ��������, ����� ������� ������� 10 ���-�����
	�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
	�������� ���������� �����.
	������� �� ��������, ������ � ������ ������� �����.
	������ �����: ����� �� ��������� [1..999]
	������: 1
	�����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14*/

	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n;
	      do{
	         System.out.print("Insert n number:");
	         n = sc.nextInt();
	      }while(n < 1 || n > 999);

	      int count = 1;

	      while( count <= 10){
	         if( n % 2 == 0 || n % 3 == 0 || n % 5 == 0){
	            System.out.print(count++ +":"+n+" ");
	         }
	         n++;
	      }

	   }

}
