import java.util.Scanner;

public class Task25 {
	/*�� �� ������� ��������, ����� �� ������ ����� N, �� ���������
	N!, �.�. 1*2*3*4...*N.
	������: 5
	�����: 120
	����������� ����� do-while.*/ 
	public static void main(String[] args) {
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int n;
	      long sum=1;

	      System.out.print("Insert n number:");
	      n = sc.nextInt();
	      int i=1;
			do{
				sum*=i;
				++i;
			}while(i<=n);
			System.out.println(sum);

	}

}
