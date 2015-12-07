package homework3;

public class Task5 {
	/*
	 * Напишете програма, която създава масив с 10 елемента и инициализира всеки
	 * от елементите със стойност равна на индекса на елемента умножен по 3. Да
	 * се изведат елементите на екрана.
	 */
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int index = 0; index < array.length; index++) {
			array[index] = index*3;
			System.out.print(array[index] + " ");
		}
	}
}
