package SortAlgo;

public class QuickSort {
	public static void main(String[] args) {
		// best case O(nlogn)
		// worst case O(n^2)
		int[] arr = { 15, 4, 1, 3, 6, 10, 7 };
		quickSort(arr, 0, arr.length - 1);
		for (int i : arr)
			System.out.println(i);
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int start = low;
		int end = high;
		int mid = start + (end - start) / 2;
		int p = arr[mid];

		while (start <= end) {
			while (arr[start] < p) {
				start++;
			}
			while (arr[end] > p) {
				end--;
			}
			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}

		quickSort(arr, low, end);
		quickSort(arr, start, high);
	}
}
