import java.util.Scanner;

public class Task9 {
	//�� �� ������� ��������, ����� ���� �� ��������� 2 ����������
	//���������� ����� a,b.
	//���������� �� ������ � ��������� ���� ���������� ����� ��
	//�������������� �� ����� ����� � �����, ����� � ������ �����.
	//������ �����: a,b - ���������� ����� �� ��������� [10..99].
	//������: 15, 25
	//�����: 375, 5 �������

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first number: ");
		int first = sc.nextInt();
		System.out.print("Insert second number: ");
		int second = sc.nextInt();
		int product, a;
		product = second*first;
		 a = product %10;
		// System.out.println(a);
		System.out.print("Product is: "+product);
		if(a % 2==1){
            System.out.println(", "+a+" odd");
        }else{
            System.out.println(", "+a+" even");
        }
	}
}
