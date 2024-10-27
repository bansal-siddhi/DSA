package SortAlgo;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 15, 4, 1, 3, 6, 10, 7 };
		int length = arr.length;
		selectionSort(arr, length);
		for (int i : arr)
			System.out.println(i);
	}

	public static void selectionSort(int[] arr, int length) {
		// O(n^2) time complexity
		for (int i = 0; i < length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}
}
