package TwoPointer;

public class MaxSumInRange {
	public static void main(String[] args) {
		int[] arr = { -1, 2, 3, 3, 4, 5, -1 };
		int k = 4;
		System.out.println(twoPointer(arr, k));
	}

	private static int twoPointer(int[] arr, int k) {
		// time complexity: O(n)
		int maxSum = 0;
		int sum = 0;
		int l = 0;
		int r = k - 1;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		while (r < arr.length - 1) {
			sum -= arr[l];
			l++;
			r++;
			sum += arr[r];
			maxSum = Math.max(maxSum, sum);
		}

		return maxSum;
	}
}
