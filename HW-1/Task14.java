import java.util.Scanner;

public class Task14 {
	//Да се състави програма, която по въведени координати на 2 позиции
	//от шахматната дъска извежда отговор дали са оцветени в еднакъв или
	//различен цвят. 
	//Шахматната дъска е квадратна.
	//Въвеждат се две двойки числа от интервала [1..8].
	//Пример: 2 2 3 2
	//Изход: Позициите са с различен цвят
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert first a row (between 1 and 8): ");
		int row1 = sc.nextInt();
		System.out.print("Insert a first column (between 1 and 8): ");
		int column1 = sc.nextInt();
		System.out.print("Insert second a row (between 1 and 8): ");
		int row2 = sc.nextInt();
		System.out.print("Insert second column (between 1 and 8):  ");
		int column2 = sc.nextInt();
		if(row1==1 || row1==3 || row1==5 || row1==7){
			if (column1==1 || column1==3 || column1==5 || column1==7) {
				System.out.println("Row 1: "+row1+", Column 1: "+column1+" - White square");
			}else if(column1==2 || column1==4 ||column1==6 || column1==8){
				System.out.println("Row 1: "+row1+", Column 1: "+column1+" - Black square");
			}
		}
		if(row1==2 || row1==4 || row1==6 || row1==8){
			if (column1==1 || column1==3 || column1==5 || column1==7) {
				System.out.println("Row 1: "+row1+", Column 1: "+column1+" - Black square");
			}else if(column1==2 || column1==4 || column1==6 || column1==8){
				System.out.println("Row 1: "+row1+", Column 1: "+column1+" - White square");
			}
		}
		if(row2==1 || row2==3 || row2==5 || row2==7){
			if (column2==1 || column2==3 || column2==5 || column2==7) {
				System.out.println("Row 2: "+row2+", Column 2: "+column2+" - White square");
			}else if(column2==2 || column2==4 ||column2==6 || column2==8){
				System.out.println("Row 2: "+row2+", Column 2: "+column2+" - Black square");
			}
		}
		if(row2==2 || row2==4 || row2==6 || row2==8){
			if (column2==1 || column2==3 || column2==5 || column2==7) {
				System.out.println("Row 2: "+row2+", Column 2: "+column2+" - Black square");
			}else if(column2==2 || column2==4 || column2==6 || column2==8){
				System.out.println("Row 2: "+row2+", Column 2: "+column2+" - White square");
			}
		}
		
	}
}
