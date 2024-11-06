import java.util.Scanner;
public class AscendingSeq{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];
		array = readFillArray(arraySize, sc);
		System.out.println("always ascending = " + isAscending(array));
	}
	public static int[] readFillArray(int arraySize, Scanner sc){
		int[] array = new int[arraySize];
		for(int i = 0; i < arraySize; i++){
			array[i] = sc.nextInt();
		}
		return array;
	}
	public static boolean isAscending(int[] array){
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] >= array[i+1]) {
				return false;
			}
		}
		return true;
	}
}