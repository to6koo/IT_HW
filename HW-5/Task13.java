package homework5;
import java.util.Arrays;
public class Task13 {
	
	
	
	static int[] mergeArrays(int[] a, int[] b) {
	
	int[] result = new int[a.length + b.length];
	
	int indexA = 0;
	int indexB = 0;
	int index = 0;
	
	while (indexA < a.length) {
	result[index] = a[indexA];
	indexA++;
	index++;
	}
	
	while (indexB < b.length) {
	result[index] = b[indexB];
	indexB++;
	index++;
	}
	return result;
	}
	public static void main(String[] args) {
	System.out.println(Arrays.toString(mergeArrays(
			new int[] { 3,4,5,6,7,6,21,23,432 },
			new int[] { 32,1,23,32,13,4,1325 })));
	}
	}

