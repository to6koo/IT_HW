package homework4;

import java.util.Scanner;

public class Task5 {
/*	Да се състави програма, при която предварително са въведени
	естествени числа в двумерен масив 4*4 елемента.
	Програмата да извежда резултат от проверката какво е съотношението
	на най-голямата сума по редове спрямо най-голямата сума по колони.
	Пример:
	1,2,3,4
	5,6,7,8
	9,10,11,12
	13,14,15,16
	Изход:
	най-голяма сума по редове 58
	най-голяма сума по колони 40
	Максималната сума по редове е > от максималната сума по колони*/
	public static void main(String[] args) {
		/*int[][] arr = { {1,2,3,4},
				  		{5,6,7,8}, 
				  		{9,10,11,12}, 
				  		{13,14,15,16} };*/
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("rows of array: ");
		int rows = sc.nextInt();
		System.out.print("cols of array: ");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		System.out.println("Insert a numbers: ");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print("");
				arr[row][col] = sc.nextInt();
			}
		}
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");

			}
			System.out.println();
		}
		
		int maxRow=0;
		int maxCol=0;
		int sumRows=0;
		int sumCols=0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sumRows = sumRows + arr[row][col];
				sumCols = sumCols + arr[col][row];
				if(sumRows>maxRow){
					maxRow=sumRows;
				}
				if(sumCols>maxCol){
					maxCol=sumCols;
				}
			}
			sumRows=0;
			sumCols=0;
		}
		System.out.println(maxRow);
		System.out.println(maxCol);
		if(maxRow>maxCol){
			System.out.println("Max value of row > Max value of col");
			
		}else if(maxRow<maxCol){
			System.out.println("Max value of row < Max value of col");
		}else if(maxRow==maxCol){
			System.out.println("Max value of row = Max value of col");
		}
	}

}
