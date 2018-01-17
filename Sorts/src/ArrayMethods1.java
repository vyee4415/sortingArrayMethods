
public class ArrayMethods1 {

	public static void insertionSort(int [] list1) {
		int x = 1;
		while(x < list1.length) {
			for(int i = 0; i < x; i ++) {
				if(list1[i]>x) {
					SwapInt(list1, x, i);
				}
			}
		}
	}
	
	public static void selectionSort(double[] list1) {
		
	}
	
	public static void bubbleSort(String[] list1) {
		
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
