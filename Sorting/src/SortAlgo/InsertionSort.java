package SortAlgo;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 15, 4, 1, 3, 6, 10, 7 };
		int length = arr.length;
		selectionSort(arr, length);
		for (int i : arr)
			System.out.println(i);
	}

	public static void selectionSort(int[] arr, int length) {
		// O(n^2) time complexity
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
