import java.util.Scanner;

public class Task14 {
	/*�� �� ������� ��������, ����� �� ��������
	���������� ����� N �� ��������� [10..200] ������� � �������
	��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.*/
	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n;
	      do{
	         System.out.print("Insert n number:");
	         n = sc.nextInt();
	      }while(n < 10 || n > 200);

	      while (n != 0){
	         if(n % 7 == 0) System.out.println(n);
	         n--;
	      }
	   }

}
