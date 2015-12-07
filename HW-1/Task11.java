import java.util.Scanner;

public class Task11 {
	//Съставете програма, която по дадено трицифренo число проверява
	//дали числото се дели на всяка своя цифра. Във въведеното число да
	//няма цифра 0.
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
        if(num % first==0){
        	System.out.println("Multiple by "+first);
        }else{
        	System.out.println("Not multiple by "+first);
        }
        if(num % second==0){
        	System.out.println("Multiple by "+second);
        }else{
        	System.out.println("Not multiple by "+second);
        }
        if(num % third==0){
        	System.out.println("Multiple by "+third);
        }else{
        	System.out.println("Not multiple by "+third);
        }
        if((num % third==0) && (num%first==0) && (num%second==0)){
        	System.out.println("Multiple by all numbers");
        }else{
        	System.out.println("Not Multiple by those numbers");
        }
         
     //   System.out.println(first);
      //  System.out.println(second);
      //  System.out.println(third);

	}

}
