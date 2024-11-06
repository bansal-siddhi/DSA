package Questions;

public class Sort01and2 {
	public static void main(String[] args) {
		int[] arr = { 0, 2, 1, 0, 0, 1, 2 };
		dutchNationalFlagAlgorithm(arr, 0, 0, arr.length - 1);
		for (int i : arr)
			System.out.println(i);
	}

	private static void dutchNationalFlagAlgorithm(int[] arr, int low, int mid, int high) {
		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1)
				mid++;
			else {
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
			}
			dutchNationalFlagAlgorithm(arr, low, mid, high);
		}
	}
}
