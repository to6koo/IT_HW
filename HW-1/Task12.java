import java.util.Scanner;

public class Task12 {
	//��������� ������ �� ������ ������ ������ �� 4 � ����������
	//����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
	//�� 1600 � 2000 �� ���������.
	//��������� ��������, ����� �� ������ ���, �����, ������ ���������
	//���������� ����.
	//������ �����: ��� ����� �� ���, �����, ������.
	//������: 28, 2, 2000
	//�����: 1,3,2000

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a date (between:1/31): ");
		int date = sc.nextInt();
		System.out.print("Insert a month (between 1/12): ");
		int month = sc.nextInt();
		System.out.print("Insert a year: ");
		int year = sc.nextInt();
		System.out.println("Current date: " +date+" "+month+" "+year );
		
		if ((year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 )) && month==2 && date==28) {
			date=29;
			
			System.out.println("Next date: " +date+" "+month+" "+year );
					
				}
		else if ((date==30 && month==4)|| (date==30 && month==6)|| 
			(date==30 && month==9)|| (date==30 && month==11)){
			date=1;
			month++;
			System.out.println("Next date: " +date+" "+month+" "+year );
		}
		else if (date==28 && month==2){
			date=1;
			month++;
			System.out.println("Next date: " +date+" "+month+" "+year );
		}
		else if(date==31 && month!=12){
			date=1;
			month++;
			System.out.println("Next date: " +date+" "+month+" "+year );
		}else if(month==12 && date==31){
			date=1;
			month=1;
			year++;
			System.out.println("Next date: " +date+" "+month+" "+year );
		
		}else if  (date>=1 && date<31) {
			date++;
			System.out.println("Next date: " +date+" "+month+" "+year );
		}
		
		
			
		}
}





