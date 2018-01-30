
public class ArrayMethods1 {

	public static void insertionSort(int [] list1) {
		int x = list1[0];
		for(int i = 1; i < list1.length; i++) {
			if(x>list1[i]) {
				x=list1[i];
			}
		}
		
	}
	
	public static void selectionSort(double[] list1) {
		
	}
	
	public static void bubbleSort(String[] list1) {
		for(int i = 0; i < list1.length; i++) {
			if(list1[i]>list1[i+1]) {
				SwapString(list1[],list1[i],list1[i+1]);
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
