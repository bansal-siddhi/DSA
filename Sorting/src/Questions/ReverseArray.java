package Questions;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		reverseArray(arr);
		reverseArray(arr2);
		for (int i : arr)
			System.out.println(i);

		for (int i : arr2)
			System.out.println(i);
	}

	private static void reverseArray(int[] arr) {
		// time complexity:O(n)
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			r--;
			l++;
		}
	}
}
