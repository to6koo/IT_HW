import java.util.Scanner;

public class Task10 {
	/*�������� ����� �� ������������ � ���������� ���� �
	������. ������ ����� � ���� ����� �� ���� ���� �� 1 � �� ����
	��.*/
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		 Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = sc.nextInt();

	        while (n>0){
	            boolean isPrime = true;
	            for (int i =2; i <= n/2;i++){
	                if(n % i == 0){
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime == true){
	                System.out.println("The nummber is prime!");
	                break;
	            }
	            else{
	                System.out.println("The number is not prime!");
	                break;
	            }
	        }
	    }
}

