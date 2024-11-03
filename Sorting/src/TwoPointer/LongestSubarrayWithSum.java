package TwoPointer;

public class LongestSubarrayWithSum {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 7, 10 };
		int k = 14;
		System.out.println(largestSubarray(arr, k));
	}

	private static int largestSubarray(int[] arr, int k) {
		int max = 0;
		int sum = 0;
		int l = 0;
		int r = 0;
		while (r < arr.length) {
			sum += arr[r];
			while (sum > k) {
				sum -= arr[l];
				l++;
			}
			if (sum <= k)
				max = Math.max(max, r - l + 1);
			r++;
		}
		return max;
	}
}
