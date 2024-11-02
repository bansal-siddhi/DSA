package SecondLargestSecondSmallest;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] arr = { 15, 4, 1, 3, 6, 10, 7 };
		arr = sort(arr);
		System.out.println("Second largest: " + arr[arr.length - 2]);
		System.err.println("Second smallest: " + arr[1]);
	}

	private static int[] sort(int[] arr) {
		// time complexity: O(nlogn)
		if (arr.length == 1)
			return arr;

		int mid = arr.length / 2;

		int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

		return mergeSort(right, left);
	}

	public static int[] mergeSort(int[] right, int[] left) {
		int[] sortedArr = new int[right.length + left.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < right.length && j < left.length) {
			if (right[i] < left[j]) {
				sortedArr[k] = right[i];
				i++;
			} else if (right[i] > left[j]) {
				sortedArr[k] = left[j];
				j++;
			}
			k++;
		}

		while (i < right.length) {
			sortedArr[k] = right[i];
			k++;
			i++;
		}

		while (j < left.length) {
			sortedArr[k] = left[j];
			k++;
			j++;
		}
		return sortedArr;
	}

}
