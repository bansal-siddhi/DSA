package Questions;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2, 3 };
		System.out.println(optimalApproach(arr));
	}

	private static int singleNumber(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int num = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i]) + 1);
			else
				map.put(nums[i], 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1)
				num = entry.getKey();
		}
		return num;
	}

	private static int optimalApproach(int[] nums) {
		int num = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			num = num ^ nums[i];
		}
		return num;
	}
}
