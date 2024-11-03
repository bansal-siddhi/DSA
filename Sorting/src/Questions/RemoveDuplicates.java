package Questions;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2 };
		int[] arr2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(arr));
		System.out.println(removeDuplicates(arr2));
	}

	public static int removeDuplicates(int[] nums) {
		int l = 0;
		int r = 1;
		while (r < nums.length) {
			if (nums[r] != nums[l]) {
				l++;
				nums[l] = nums[r];
			}
			r++;
		}
		return l + 1;
	}
}
