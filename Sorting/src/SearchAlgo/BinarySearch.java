package SearchAlgo;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 6, 4 };
		int target = 6;
		System.out.println(binarySearch(arr, 0, arr.length - 1, target));
	}

	public static int binarySearch(int[] arr, int start, int end, int target) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < target)
				start = mid + 1;
			else if (arr[mid] > target)
				end = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}
