import java.util.Scanner;

public class Task10 {
	//Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
	//3 литра и ги ползвате едновременно.
	//Да се състави програма, която по даден обем извежда как ще прелеете
	//течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
	//кофите. Кофите не могат да се ползват с частично количество вода.
	//Входни данни: естествено число от интервала [10..9999].
	//Пример: 107
	//Изход: 21 пъти по 2 литра,
	//21 пъти по 3 литра
	//допълнително кофа от 2 литра
	public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        System.out.println("Insert Volume :");
	        int volume = sc.nextInt();
	         
	        if(volume >= 10 && volume <= 9999){
	             
	            int times = volume / 5;   //сбора на 2 и 3 дава 5 
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


