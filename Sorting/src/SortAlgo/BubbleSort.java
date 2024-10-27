package SortAlgo;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 15, 4, 1, 3, 6, 10, 7 };
		int length = arr.length;
		bubbleSort(arr, length);
		for (int i : arr)
			System.out.println(i);
	}

	public static void bubbleSort(int[] arr, int length) {
		// O(n^2) time complexity
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
