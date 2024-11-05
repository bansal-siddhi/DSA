package Questions;

import java.util.ArrayList;

public class MoveZeroestoEnd {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 0, 2, 3 };
		OptimalSolution(arr);
		for (int i : arr)
			System.out.println(i);
	}

	private static void bruteForce(int[] arr) {
		// time complexity: O(n)
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				list.add(arr[i]);
		}

		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}

		for (int i = list.size(); i < arr.length; i++) {
			arr[i] = 0;
		}
	}

	private static void OptimalSolution(int[] arr) {
		int j = -1;
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}

		if (j == -1)
			return;

		for (int i = j + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}
}
