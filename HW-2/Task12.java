
public class Task12 {
	/*Да се състави програма, която извежда всички
	естествени трицифрени числа, които нямат еднакви цифри т.е.
	100,101, 606 и т.н. не се извеждат.*/
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
