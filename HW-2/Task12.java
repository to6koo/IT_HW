
public class Task12 {
	/*�� �� ������� ��������, ����� ������� ������
	���������� ���������� �����, ����� ����� ������� ����� �.�.
	100,101, 606 � �.�. �� �� ��������.*/
	public static void main(String[] args) {
		int a;
		int b;
		
		for(a=100, b=999; a<=b; a++){
			int first, second, third;
	        int c,d;
	        first = a / 100;
	        c = a % 100;
	        second = c / 10;
	        d = c % 10;
	        third = d / 1;
	        if (!((first==second && second==third && third==first) ||
	           (first==second) || (second==third) || (third==first))) {
	        	System.out.println(a);
			}
			
		}
	}

}
