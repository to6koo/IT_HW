import java.util.Scanner;

public class Task7 {
	//���������� �� 3, �� �� ������� �� ������ ������� n
	//����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert � n: ");
		int n = sc.nextInt();
		
		for(int i=3, j=n; i<=j; i++){
			if(i%3==0)
			System.out.print(i+",");
		}
		
		

	}

}
