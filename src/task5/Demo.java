package task5;
import java.util.Arrays;
import java.util.Random;

public class Demo {
	//i'd like to show the time of insertion sort because the difference between ways of sort is time
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			Random rnd = new Random();
			arr[i] = rnd.nextInt(1000);
		}
		insertionSort(arr);
	}
	
	public static void insertionSort(int[] arr) {
		long start2 = System.currentTimeMillis(); 
		int[] arr2 = arr.clone();
		for (int i = 1; i < arr2.length; i++) {
			int current = arr2[i];
			int location = i - 1;
			while (location >= 0 && arr2[location] > current) {
				arr2[location + 1] = arr2[location];
				location--;
			}
			arr2[location + 1] = current;
		}
		long end2 = System.currentTimeMillis();
		long time2 = end2 - start2;
		System.out.println("Time for Insertion: " + time2);
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
