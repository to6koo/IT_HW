import java.util.Scanner;

public class Task16 {
	//�������� � ���������� ���������� ����� �� ���� abc.
	//������ �� �� ������� ����:
	//��� a = b = c - �����: ������� �� �����;
	//��� a>b>c - �����: ������� �� ��� �������� ���;
	//��� a<b<c ������� �� � �������� ���;
	//� �����: ������� �� ����������, �� ����������� ������.
	//�� �� ������� ��������, ����� ������� ��������� �� ���������� ��
	//������� �� ������� � �������.
	//������: 345
	//�����: �������� ���.

	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a number without zero(0): ");
        int num = keyboard.nextInt();
        int first, second, third;
        int a,b;
        first = num / 100;
        a = num % 100;
        second = a / 10;
        b = a % 10;
        third = b / 1;
        if (first>second && second>third) {
        	System.out.print(first+">"+second+">"+third);
			System.out.println(" The figures are ascending");
		}
        else if (third>second && second>first) {
        	System.out.print(first+"<"+second+"<"+third);
			System.out.println(" Figures are in descending order");
		}
        else if (third==second && second==first) {
        	System.out.print(first+"="+second+"="+third);
			System.out.println(" Figures are in equal");
		}else{
			System.out.println("The figures are not arranged");
		}
          

	}

}
