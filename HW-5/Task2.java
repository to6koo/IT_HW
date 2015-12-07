package homework5;

import java.util.Scanner;



public class Task2 {
	/*Да се състави програма, чрез която от клавиатурата се въвеждат
	последователно две думи с дължина 10-20 знака.
	Програмата да размени първите им 5 знака и да изведе дължината на
	по-дългата, както и новото им съдържание.
	Пример: uchilishe uchenik
	Изход: 9 uchenishe*/

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

