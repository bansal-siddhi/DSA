package SearchAlgo;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 6, 4 };
		int target = 6;
		System.out.println(linearSearch(arr, target));
	}

	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}
}
