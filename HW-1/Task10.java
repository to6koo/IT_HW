import java.util.Scanner;

public class Task10 {
	//������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
	//3 ����� � �� �������� ������������.
	//�� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
	//��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
	//������. ������ �� ����� �� �� ������� � �������� ���������� ����.
	//������ �����: ���������� ����� �� ��������� [10..9999].
	//������: 107
	//�����: 21 ���� �� 2 �����,
	//21 ���� �� 3 �����
	//������������ ���� �� 2 �����
	public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        System.out.println("Insert Volume :");
	        int volume = sc.nextInt();
	         
	        if(volume >= 10 && volume <= 9999){
	             
	            int times = volume / 5;   //����� �� 2 � 3 ���� 5 
	            int plus = volume % 5;
	             
	            System.out.println(times + " times more " + "2 litres");
	            System.out.println(times + " times more " + "3 litres");
	            System.out.println("additional bucket " + plus + "liter");
	        }
	        else{
	            System.out.println("The volume must be between 10 and in 9999!");
	        }
	    }
	 
	
	}


