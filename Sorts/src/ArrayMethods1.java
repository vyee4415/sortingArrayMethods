import java.util.Arrays;

// Vivian Yee
// 2/1/18
// In place sorts lab

public class ArrayMethods1 {
	public static void main(String[] args) {
		int[] test1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double[] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String[] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test1));
		System.out.println("");
		
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test2));
		System.out.println("");
		
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test3));
	}
	
	// https://www.geeksforgeeks.org/insertion-sort/
	public static void insertionSort(int [] list1) {
		int i, key, j; // initialize variables i, key, and j
		for(i = 1; i < list1.length; i++) { // for loop to go through all elements in array
			key = list1[i]; // variable key contains element in position i
			j = i - 1; // variable j is 1 less than i
			while((j>=0)&&(list1[j] > key)) { // while the number before is greater than the element contained in key,
				SwapInt(list1, j+1, j); // switch the values
				j = j - 1; // value of j decreases, making them check the elements before
			}
			list1[j+1] = key; // sets the value in the position of j+1 as key
		}
	}
	
	public static void selectionSort(double[] list2) {
		int x = 0;
		int y = 0;
		for(int j = 0; j < list2.length;j++) {
			for(int i = 1; i < list2.length; i++) {
				if(list2[x]>list2[i]) {
					x=i;
				}
			}
			SwapDouble(list2,y,x);
			y++;
		}
	}
	
	public static void bubbleSort(String[] list3) {
		for(int i = 1; i < list3.length; i++) {
			if(list3[i-1]>list3[i]) {
				
			}
		}
	}
	
	public static void SwapInt(int[] arr, int index, int index2) {
		int x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
	
	public static void SwapDouble(double[] arr, int index, int index2) {
		double x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
	
	public static void SwapString(String[] arr, int index, int index2) {
		String x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
}
