package RotateArray;

public class RotateArrayRightbyD {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 3;
		rotateArray(arr, d);
		for (int i : arr)
			System.out.println(i);
	}

	private static void reverseArray(int[] arr, int low, int high) {
		int l = low;
		int r = high - 1;
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			r--;
			l++;
		}
	}

	private static void rotateArray(int[] arr, int d) {
		if (arr.length == 1) {
			return;
		}
		if (d > arr.length) {
			d = d % arr.length;
		}
		reverseArray(arr, 0, arr.length);
		reverseArray(arr, 0, d);
		reverseArray(arr, d, arr.length);

	}
}
