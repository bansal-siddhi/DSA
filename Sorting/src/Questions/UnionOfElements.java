package Questions;

import java.util.ArrayList;

public class UnionOfElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 2, 3, 4, 4, 5, 11, 12 };

		ArrayList<Integer> list = optimalApproach(arr, arr2);
		System.out.println(list);
	}

	private static ArrayList<Integer> approach1(int[] arr, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i : arr) {
			if (!list.contains(i))
				list.add(i);
		}

		for (int i : arr2) {
			if (!list.contains(i))
				list.add(i);
		}

		return list;
	}

	private static ArrayList<Integer> optimalApproach(int[] arr, int[] arr2) {
		int i = 0;
		int j = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (i < arr.length && j < arr.length) {
			if (arr[i] < arr2[j]) {
				if (list.isEmpty() || list.get(list.size() - 1) != arr[i])
					list.add(arr[i]);
				i++;
			} else {
				if (list.isEmpty() || list.get(list.size() - 1) != arr2[j])
					list.add(arr2[j]);
				j++;
			}
		}
		while (i < arr.length) {
			if (list.get(list.size() - 1) != arr[i])
				list.add(arr[i]);
			i++;
		}
		while (j < arr2.length) {
			if (list.get(list.size() - 1) != arr2[j])
				list.add(arr2[j]);
			j++;
		}

		return list;
	}
}
