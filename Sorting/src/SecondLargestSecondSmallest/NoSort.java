package SecondLargestSecondSmallest;

public class NoSort {
	public static void main(String[] args) {
		int[] arr = { 15, 4, 1, 3, 6, 10, 7 };
		int len = arr.length;
		int[] smallest = secondLargestSecondSmallest(arr, len);
		for (int i : smallest)
			System.out.println(i);
	}

	public static int[] secondLargestSecondSmallest(int[] arr, int len) {
		int largest = Integer.MIN_VALUE;
		int sLargest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int sSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < len; i++) {
			if (largest < arr[i]) {
				sLargest = largest;
				largest = arr[i];
			} else if (sLargest < arr[i]) {
				sLargest = arr[i];
			}
			if (smallest > arr[i]) {
				sSmallest = smallest;
				smallest = arr[i];
			} else if (sSmallest > arr[i]) {
				sSmallest = arr[i];
			}
		}
		return new int[] { sLargest, sSmallest };
	}
}
