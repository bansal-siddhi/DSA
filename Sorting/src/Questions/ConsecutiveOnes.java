package Questions;

public class ConsecutiveOnes {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findConsecutiveOnes(arr));
	}

	private static int findConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 1)
				count++;
			else
				count = 0;
			max = Math.max(max, count);

		}
		return max;
	}
}
