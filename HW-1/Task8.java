import java.util.Scanner;

public class Task8 {
	//�� �� ������� ��������, ����� ���� �� ��������� 4-������o
	//���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
	//�������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
	//� 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
	//3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
	//���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
	//������: 3332 �����: ��-����� (32<33)
	//������: 1144 �����: ����� (14=14)
	//������: 9875 �����: ��-������ (95>87)

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first (A) number: ");
		int num = sc.nextInt();
		int first, second;
		 int a;
	        first = num / 100; //
	        a = num % 100;
	        second = a / 1;
	     //   b = a % 1;
	   //     System.out.println(first);
	   //     System.out.println(second);
	        if(second>first){
	        	System.out.println(second+">"+first);
	}
	        if(second<first){
	        	System.out.println(second+"<"+first);
	        }
	        if (second==first) {
				System.out.println(second+"="+first);
			}
	}
}
