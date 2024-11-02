package Questions;

public class SortedArray {
	public static void main(String[] args) {
		int[] arr = { 15, 4, 1, 3, 6, 10, 7 };
		int[] sortedArr = { 1, 4, 6, 8, 9 };
		System.out.println(checkForSorted(arr));
		System.out.println(checkForSorted(sortedArr));
	}

	private static boolean checkForSorted(int[] arr) {
		// time complexity: O(n)
		for (int i = 0; i < arr.length - 1; i++) {
			if (!(arr[i] < arr[i + 1]))
				return false;
		}
		return true;
	}
}
