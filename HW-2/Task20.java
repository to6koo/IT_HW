
public class Task20 {
		/*������ 20:
		�� �� ������� ��������, ���� ����� �� ������� ������� ��
		�����. ������ �� ���������� �� ���������� ��� ��� ����� ��
		����� �� 45.*/
	public static void main(String[] args) {
	       int k = 0;
	      for(int i = 1; i <= 10; i++, k++){
	         k=i;
	         for( int j = 0; j <= 9; j++, k++){
	            if(k > 9) k = 0;
	            System.out.print(k + " ");
	         }
	         System.out.println();
	      }
	}
}
