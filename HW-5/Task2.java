package homework5;

import java.util.Scanner;



public class Task2 {
	/*�� �� ������� ��������, ���� ����� �� ������������ �� ��������
	�������������� ��� ���� � ������� 10-20 �����.
	���������� �� ������� ������� �� 5 ����� � �� ������ ��������� ��
	��-�������, ����� � ������ �� ����������.
	������: uchilishe uchenik
	�����: 9 uchenishe*/

public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
      
      String stringA;
      String stringB;
      System.out.print("Insert first string:");
      stringA = sc.next();
      System.out.print("Insert second string:");
      stringB = sc.next();
      
     /* StringBuilder builder = new StringBuilder(stringA);
      StringBuilder builder2 = new StringBuilder(stringB);
      */
      if(stringA.length()<stringB.length()){
    	
    	  System.out.println(stringA.substring(0,5)+(stringB.substring(5)));
      }else{
    	  System.out.println(stringB.substring(0,5)+(stringA.substring(5)));
      }

     
     
     
      
      		
    	 
}
       
}

