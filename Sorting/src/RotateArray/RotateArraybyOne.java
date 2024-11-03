package RotateArray;

public class RotateArraybyOne {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		rotateArray(arr);
		for (int i : arr)
			System.out.println(i);
	}

	private static void rotateArray(int[] arr) {
		// time complexity: O(n)
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}
}
